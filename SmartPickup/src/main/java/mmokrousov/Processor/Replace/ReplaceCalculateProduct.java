package mmokrousov.Processor.Replace;

import mmokrousov.Model.AccountNoUnc.Response.AccountsNoUncResponse;
import mmokrousov.Model.CalculateProduct.Request.CalculateProductRequest;
import mmokrousov.Model.CalculateProduct.Response.CalculateProductResponse;
import mmokrousov.Model.DepositNoUnc.Response.DepositNoUncResponse;
import mmokrousov.Model.DepositNoUnc.Response.Rates;
import mmokrousov.Model.DepositNoUnc.Response.Terms;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Request.GetDepositsAndSavingsAccountsRequest;
import mmokrousov.Processor.MathLogicCalculateProduct.MathLogicAccount;
import mmokrousov.Processor.MathLogicCalculateProduct.MathLogicDeposit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ReplaceCalculateProduct {
    MathLogicAccount mathLogicAccount = new MathLogicAccount();
    MathLogicDeposit mathLogicDeposit = new MathLogicDeposit();

    private void filterTerms(Terms terms, CalculateProductRequest request) {
        terms.getRates().removeIf(rates -> !(rates.getMinimumAmount() <= request.getAmount()));

        while (terms.getRates().size() > 1){
            Rates rates = terms.getRates().get(1);
            if (rates.getMinimumAmount() > terms.getRates().get(0).getMinimumAmount()) {
                terms.getRates().remove(0);
                continue;
            }
            terms.getRates().remove(1);
        }

    }

    public DepositNoUncResponse filterDeposit(CalculateProductRequest request, DepositNoUncResponse depositNoUncResponse) {
        boolean isAdditionAvailable = false;
        boolean isSubtractionAvailable = false;
        if (request.getOptions().contains("refill")) isAdditionAvailable = true;
        if (request.getOptions().contains("withdrawal")) isSubtractionAvailable = true;

        boolean finalIsAdditionAvailable = isAdditionAvailable;
        boolean finalIsSubtractionAvailable = isSubtractionAvailable;

        if (finalIsAdditionAvailable == true && finalIsSubtractionAvailable == false) {

            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsAdditionAvailable() == finalIsAdditionAvailable
                            && deposits.getProductId().equals(request.getCode()))
                    .peek(deposits -> {
                        deposits.getProducts().stream()
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                    products.getTerms()
                                            .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                    products.getTerms()
                                            .forEach(terms -> filterTerms(terms, request));
                                })
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList());
                    })
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        } else if (finalIsAdditionAvailable == false && finalIsSubtractionAvailable == true) {

            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsSubtractionAvailable() == finalIsSubtractionAvailable
                            && deposits.getProductId().equals(request.getCode()))
                    .peek(deposits -> {
                        deposits.getProducts().stream()
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                    products.getTerms()
                                            .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                    products.getTerms()
                                            .forEach(terms -> filterTerms(terms, request));
                                })
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList());
                    })
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        } else if (finalIsAdditionAvailable == true && finalIsSubtractionAvailable == true) {

            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsSubtractionAvailable() == finalIsSubtractionAvailable
                            && deposits.getIsAdditionAvailable() == finalIsAdditionAvailable
                            && deposits.getProductId().equals(request.getCode()))
                    .peek(deposits -> {
                        deposits.getProducts().stream()
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                    products.getTerms()
                                            .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                    products.getTerms()
                                            .forEach(terms -> filterTerms(terms, request));
                                })
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList());
                    })
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        } else {

            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getProductId().equals(request.getCode()))
                    .peek(deposits -> {
                        deposits.getProducts().stream()
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                    products.getTerms()
                                            .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                    products.getTerms()
                                            .forEach(terms -> filterTerms(terms, request));
                                })
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList());
                    })
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));
        }
        return depositNoUncResponse;
    }


    public CalculateProductResponse replaceCalculateProduct(CalculateProductResponse etalon, CalculateProductRequest request, CalculateProductResponse response, AccountsNoUncResponse accountsNoUncResponse, DepositNoUncResponse depositNoUncResponse) {

        //Замена с капитализацией
        if (!request.getOptions().isEmpty() && request.getOptions().contains("capitalization") && !request.getOptions().contains("welcome")) {

            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            if (request.getCode().equals("_SafeBoxId_")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentCapitalization(request, response));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(1).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(mathLogicAccount.logicPercentCapitalization(request, response) + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            } else if (request.getCode().equals("_MoneyBoxId_")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentCapitalization(request, response));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(1).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(mathLogicAccount.logicPercentCapitalization(request, response) + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            } else {
                //Замена code
                etalon.setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена income
                etalon.setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse));
                //Замена percent
                etalon.setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicDeposit.logicYield(request, etalon.getIncome()));
            }
        }

        //Замена с велком периодом
        else if (!request.getOptions().isEmpty() && request.getOptions().contains("welcome") && !request.getOptions().contains("capitalization")) {

            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            if (request.getCode().equals("_SafeBoxId_") && request.getCurrency().equals("RUB")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentWelcome(request, response, 1, accountsNoUncResponse));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(0).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            } else if (request.getCode().equals("_MoneyBoxId_") && request.getCurrency().equals("RUB")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentWelcome(request, response, 0, accountsNoUncResponse));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(0).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            } else  if(request.getCode().equals("_MoneyBoxId_") || request.getCode().equals("_SafeBoxId_") && !request.getCurrency().equals("RUB")){
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercent(request, response));
                //Замена percent
                etalon.setPercent(0.01);
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));
            }
            else {
                //Замена code
                etalon.setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена income
                etalon.setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse));
                //Замена percent
                etalon.setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicDeposit.logicYield(request, etalon.getIncome()));
            }
        }

        //Замена с без капитализации и велком периода
        else if (request.getOptions().isEmpty()) {

            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            if (request.getCode().equals("_SafeBoxId_")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercent(request, response));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(1).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(etalon.getPercent());

            } else if (request.getCode().equals("_MoneyBoxId_")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercent(request, response));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(1).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(etalon.getPercent());

            } else {
                //Замена code
                etalon.setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена income
                etalon.setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse));
                //Замена percent
                etalon.setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(etalon.getPercent());
            }
        }

        //Замена с велком периодом и капитализацией
        else if (!request.getOptions().isEmpty() && request.getOptions().contains("welcome") && request.getOptions().contains("capitalization")) {

            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            if (request.getCode().equals("_SafeBoxId_") && request.getCurrency().equals("RUB")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentWelcomeCapitalization(request, response, 1, accountsNoUncResponse));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(0).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            } else if (request.getCode().equals("_MoneyBoxId_") && request.getCurrency().equals("RUB")) {
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercentWelcomeCapitalization(request, response, 0, accountsNoUncResponse));
                //Замена percent
                etalon.setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(0).getAccountRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));

            }
            else  if(request.getCode().equals("_MoneyBoxId_") || request.getCode().equals("_SafeBoxId_") && !request.getCurrency().equals("RUB")){
                //Замена income
                etalon.setIncome(mathLogicAccount.logicPercent(request, response));
                //Замена percent
                etalon.setPercent(0.01);
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicAccount.logicYield(request, response));
            }
            else {
                //Замена code
                etalon.setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена income
                etalon.setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse));
                //Замена percent
                etalon.setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена totalAmount
                etalon.setTotalAmount(etalon.getIncome() + request.getAmount());
                //Замена yield
                etalon.setYield(mathLogicDeposit.logicYield(request, etalon.getIncome()));
            }
        }

        return etalon;

    }
    }

