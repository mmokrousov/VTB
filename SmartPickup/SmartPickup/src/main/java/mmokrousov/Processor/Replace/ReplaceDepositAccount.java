package mmokrousov.Processor.Replace;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mmokrousov.Model.AccountNoUnc.Response.AccountsNoUncResponse;
import mmokrousov.Model.DepositNoUnc.Response.*;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Request.GetDepositsAndSavingsAccountsRequest;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;
import mmokrousov.Processor.MathLogicDepositAccount.MathLogicAccount;
import mmokrousov.Processor.MathLogicDepositAccount.MathLogicDeposit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceDepositAccount {
    MathLogicAccount mathLogicAccount = new MathLogicAccount();
    MathLogicDeposit mathLogicDeposit = new MathLogicDeposit();

    private void filterTerms(Terms terms, GetDepositsAndSavingsAccountsRequest request) {
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

    public DepositNoUncResponse filterDeposit(GetDepositsAndSavingsAccountsRequest request, DepositNoUncResponse depositNoUncResponse) {
        boolean isAdditionAvailable = false;
        boolean isSubtractionAvailable = false;
        if (request.getOptions().contains("refill")) isAdditionAvailable = true;
        if (request.getOptions().contains("withdrawal")) isSubtractionAvailable = true;

        boolean finalIsAdditionAvailable = isAdditionAvailable;
        boolean finalIsSubtractionAvailable = isSubtractionAvailable;
        if (finalIsAdditionAvailable == true && finalIsSubtractionAvailable == false) {

            //Избавляемся от депозитов, которые не удовлетворяют условиям
            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    //Фильтруем по полю clientPackage
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsAdditionAvailable() == finalIsAdditionAvailable)
                    .peek(deposits -> {
                        deposits.setProducts(deposits.getProducts().stream()
                                //Фильтруем по валюте
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сроку из запроса
                                                    .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сумме из запроса
                                                    .forEach(terms -> filterTerms(terms, request));
                                        }
                                )
                                //Избавляемся от продуктов, которые меньше 0 после фитров выше
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList()));
                    })
                    //Избавляемся от депозитов, которые меньше 0 после фитров выше
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        } else if (finalIsAdditionAvailable == false && finalIsSubtractionAvailable == true) {

            //Избавляемся от депозитов, которые не удовлетворяют условиям
            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    //Фильтруем по полю clientPackage
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsSubtractionAvailable() == finalIsSubtractionAvailable)
                    .peek(deposits -> {
                        deposits.setProducts(deposits.getProducts().stream()
                                //Фильтруем по валюте
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сроку из запроса
                                                    .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сумме из запроса
                                                    .forEach(terms -> filterTerms(terms, request));
                                        }
                                )
                                //Избавляемся от продуктов, которые меньше 0 после фитров выше
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList()));
                    })
                    //Избавляемся от депозитов, которые меньше 0 после фитров выше
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        } else if (finalIsAdditionAvailable == true && finalIsSubtractionAvailable == true) {

            //Избавляемся от депозитов, которые не удовлетворяют условиям
            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    //Фильтруем по полю clientPackage
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase())
                            && deposits.getIsSubtractionAvailable() == finalIsSubtractionAvailable
                            && deposits.getIsAdditionAvailable() == finalIsAdditionAvailable)
                    .peek(deposits -> {
                        deposits.setProducts(deposits.getProducts().stream()
                                //Фильтруем по валюте
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сроку из запроса
                                                    .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сумме из запроса
                                                    .forEach(terms -> filterTerms(terms, request));
                                        }
                                )
                                //Избавляемся от продуктов, которые меньше 0 после фитров выше
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList()));
                    })
                    //Избавляемся от депозитов, которые меньше 0 после фитров выше
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));
        } else {
            //Избавляемся от депозитов, которые не удовлетворяют условиям
            depositNoUncResponse.setDeposits(depositNoUncResponse.getDeposits()
                    .stream()
                    //Фильтруем по полю clientPackage
                    .filter(deposits -> deposits.getPackages().contains(request.getClientPackage().toUpperCase()))
                    .peek(deposits -> {
                        deposits.setProducts(deposits.getProducts().stream()
                                //Фильтруем по валюте
                                .filter(products -> products.getCurrency().getAlphaCode().equals(request.getCurrency()))
                                .peek(products -> {
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сроку из запроса
                                                    .removeIf(terms -> !(terms.getMinimumTerm() <= request.getTerm() && terms.getMaximumTerm() >= request.getTerm()));
                                            products.getTerms()
                                                    //Избавляемся от блоков, котороые не удовлетворяют сумме из запроса
                                                    .forEach(terms -> filterTerms(terms, request));
                                        }
                                )
                                //Избавляемся от продуктов, которые меньше 0 после фитров выше
                                .filter(products -> products.getTerms().size() > 0)
                                .collect(Collectors.toList()));
                    })
                    //Избавляемся от депозитов, которые меньше 0 после фитров выше
                    .filter(deposits -> deposits.getProducts().size() > 0)
                    .collect(Collectors.toList()));

        }
        return depositNoUncResponse;

    }


    public GetDepositsAndSavingsAccountsResponse replaceEtalon(GetDepositsAndSavingsAccountsResponse etalon, GetDepositsAndSavingsAccountsResponse response, GetDepositsAndSavingsAccountsRequest request, AccountsNoUncResponse accountsNoUncResponse, DepositNoUncResponse depositNoUncResponse) {

        //Замена с капитализацией
        if (!request.getOptions().isEmpty() && request.getOptions().contains("capitalization") && !request.getOptions().contains("welcome")) {
            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            //Замена _SafeBoxId_
            //Замена percent
            etalon.getAccounts().get(0).setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(1).getAccountRate());
            //Замена income
            etalon.getAccounts().get(0).setIncome(mathLogicAccount.logicPercentCapitalization(request, response, 0));
            //Замена totalAmount
            etalon.getAccounts().get(0).setTotalAmount(request.getAmount() + etalon.getAccounts().get(0).getIncome());
            //Замена yield в РАЗРАБОТКЕ
            etalon.getAccounts().get(0).setYield(mathLogicAccount.logicYield(request, response, 0));

            //Замена _MoneyBoxId_
            //Замена percent
            etalon.getAccounts().get(1).setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(1).getAccountRate());
            //Замена income
            etalon.getAccounts().get(1).setIncome(mathLogicAccount.logicPercentCapitalization(request, response, 1));
            //Замена totalAmount
            etalon.getAccounts().get(1).setTotalAmount(request.getAmount() + etalon.getAccounts().get(1).getIncome());
            //Замена yield в РАЗРАБОТКЕ
            etalon.getAccounts().get(1).setYield(mathLogicAccount.logicYield(request, response, 1));

            //Замена deposit(1)
            if (response.getDeposits().size() > 0) {
                //Замена code
                etalon.getDeposits().get(0).setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена percent
                etalon.getDeposits().get(0).setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(0).setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse, 0));
                //Замена totalAmount
                etalon.getDeposits().get(0).setTotalAmount(request.getAmount() + etalon.getDeposits().get(0).getIncome());
                //Замена yield
                etalon.getDeposits().get(0).setYield(mathLogicDeposit.logicYield(request, etalon.getDeposits().get(0).getIncome()));
            }

            //Замена deposit(2)
            if (response.getDeposits().size() > 1) {
                //Замена code
                etalon.getDeposits().get(1).setCode(depositNoUncResponse.getDeposits().get(1).getProductId());
                //Замена percent
                etalon.getDeposits().get(1).setPercent(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(1).setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse, 1));
                //Замена totalAmount
                etalon.getDeposits().get(1).setTotalAmount(request.getAmount() + etalon.getDeposits().get(1).getIncome());
                //Замена yield
                etalon.getDeposits().get(1).setYield(mathLogicDeposit.logicYield(request, etalon.getDeposits().get(1).getIncome()));
            }
        }
        //Замена с welcome периодом
        else if (!request.getOptions().isEmpty() && request.getOptions().contains("welcome") && !request.getOptions().contains("capitalization")) {
            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            //Замена _SafeBoxId_
            //Замена percent
            if (request.getAmount() > 999999.9) {
                etalon.getAccounts().get(0).setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(1).getAccountRate());
            } else {
                etalon.getAccounts().get(0).setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(0).getAccountRate());
            }
            //Замена income
            etalon.getAccounts().get(0).setIncome(mathLogicAccount.logicPercentWelcome(request, response, 1, 0, accountsNoUncResponse));
            //Замена totalAmount
            etalon.getAccounts().get(0).setTotalAmount(request.getAmount() + etalon.getAccounts().get(0).getIncome());
            //Замена yield
            etalon.getAccounts().get(0).setYield(mathLogicAccount.logicYield(request, response, 0));

            //Замена _MoneyBoxId_
            //Замена percent
            if (request.getAmount() > 999999.9) {
                etalon.getAccounts().get(1).setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(1).getAccountRate());
            } else {
                etalon.getAccounts().get(1).setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(0).getAccountRate());
            }

            //Замена income
            etalon.getAccounts().get(1).setIncome(mathLogicAccount.logicPercentWelcome(request, response, 0, 1, accountsNoUncResponse));
            //Замена totalAmount
            etalon.getAccounts().get(1).setTotalAmount(request.getAmount() + etalon.getAccounts().get(1).getIncome());
            //Замена yield
            etalon.getAccounts().get(1).setYield(mathLogicAccount.logicYield(request, response, 1));

            //Замена deposit(1)
            if (response.getDeposits().size() > 0) {
                //Замена code
                etalon.getDeposits().get(0).setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена percent
                etalon.getDeposits().get(0).setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(0).setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse, 0));
                //Замена totalAmount
                etalon.getDeposits().get(0).setTotalAmount(request.getAmount() + etalon.getDeposits().get(0).getIncome());
                //Замена yield
                etalon.getDeposits().get(0).setYield(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
            }
            //Замена deposit(2)
            if (response.getDeposits().size() > 1) {
                //Замена code
                etalon.getDeposits().get(1).setCode(depositNoUncResponse.getDeposits().get(1).getProductId());
                //Замена percent
                etalon.getDeposits().get(1).setPercent(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(1).setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse, 1));
                //Замена totalAmount
                etalon.getDeposits().get(1).setTotalAmount(request.getAmount() + etalon.getDeposits().get(1).getIncome());
                //Замена yield
                etalon.getDeposits().get(1).setYield(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());

            }
        }
        //Замена с Капитализацией и welcome периодом
        else if (!request.getOptions().isEmpty() && request.getOptions().contains("welcome") && request.getOptions().contains("capitalization")) {
            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            //Замена _SafeBoxId_
            //Замена percent
            etalon.getAccounts().get(0).setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(0).getAccountRate());
            //Замена income
            etalon.getAccounts().get(0).setIncome(mathLogicAccount.logicPercentWelcomeCapitalization(request, response, 1, 0, accountsNoUncResponse));
            //Замена totalAmount
            etalon.getAccounts().get(0).setTotalAmount(request.getAmount() + etalon.getAccounts().get(0).getIncome());
            //Замена yield в РАЗРАБОТКЕ
            etalon.getAccounts().get(0).setYield(mathLogicAccount.logicYield(request, response, 0));

            //Замена _MoneyBoxId_
            //Замена percent
            etalon.getAccounts().get(1).setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(0).getAccountRate());
            //Замена income
            etalon.getAccounts().get(1).setIncome(mathLogicAccount.logicPercentWelcomeCapitalization(request, response, 0, 1, accountsNoUncResponse));
            //Замена totalAmount
            etalon.getAccounts().get(1).setTotalAmount(request.getAmount() + etalon.getAccounts().get(1).getIncome());
            //Замена yield в РАЗРАБОТКЕ
            etalon.getAccounts().get(1).setYield(mathLogicAccount.logicYield(request, response, 1));

            //Замена deposit(1)
            if (response.getDeposits().size() > 0) {
                //Замена code
                etalon.getDeposits().get(0).setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена percent
                etalon.getDeposits().get(0).setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(0).setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse, 0));
                //Замена totalAmount
                etalon.getDeposits().get(0).setTotalAmount(request.getAmount() + etalon.getDeposits().get(0).getIncome());
                //Замена yield
                etalon.getDeposits().get(0).setYield(mathLogicDeposit.logicYield(request, etalon.getDeposits().get(0).getIncome()));
            }
            //Замена deposit(2)
            if (response.getDeposits().size() > 1) {
                //Замена code
                etalon.getDeposits().get(1).setCode(depositNoUncResponse.getDeposits().get(1).getProductId());
                //Замена percent
                etalon.getDeposits().get(1).setPercent(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(1).setIncome(mathLogicDeposit.logicPercentCapitalization(request, depositNoUncResponse, 1));
                //Замена totalAmount
                etalon.getDeposits().get(1).setTotalAmount(request.getAmount() + etalon.getDeposits().get(1).getIncome());
                //Замена yield
                etalon.getDeposits().get(1).setYield(mathLogicDeposit.logicYield(request, etalon.getDeposits().get(1).getIncome()));
            }
        }

        //Замена без капитализации и велком периода
        else {
            depositNoUncResponse = filterDeposit(request, depositNoUncResponse);
            //Замена _SafeBoxId_
            //Замена percent
            etalon.getAccounts().get(0).setPercent(accountsNoUncResponse.getAccounts().get(1).getProducts().get(0).getRates().get(1).getAccountRate());
            //Замена income
            etalon.getAccounts().get(0).setIncome(mathLogicAccount.logicPercent(request, response, 0));
            //Замена totalAmount
            etalon.getAccounts().get(0).setTotalAmount(request.getAmount() + etalon.getAccounts().get(0).getIncome());
            //Замена yield
            etalon.getAccounts().get(0).setYield(etalon.getAccounts().get(0).getPercent());

            //Замена _MoneyBoxId_
            //Замена percent
            etalon.getAccounts().get(1).setPercent(accountsNoUncResponse.getAccounts().get(0).getProducts().get(0).getRates().get(1).getAccountRate());
            //Замена income
            etalon.getAccounts().get(1).setIncome(mathLogicAccount.logicPercent(request, response, 1));
            //Замена totalAmount
            etalon.getAccounts().get(1).setTotalAmount(request.getAmount() + etalon.getAccounts().get(1).getIncome());
            //Замена yield
            etalon.getAccounts().get(1).setYield(etalon.getAccounts().get(1).getPercent());

            //Замена deposit(1)
            if (response.getDeposits().size() > 0) {
                //Замена code
                etalon.getDeposits().get(0).setCode(depositNoUncResponse.getDeposits().get(0).getProductId());
                //Замена percent
                etalon.getDeposits().get(0).setPercent(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(0).setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse, 0));
                //Замена totalAmount
                etalon.getDeposits().get(0).setTotalAmount(request.getAmount() + etalon.getDeposits().get(0).getIncome());
                //Замена yield
                etalon.getDeposits().get(0).setYield(depositNoUncResponse.getDeposits().get(0).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
            }
            //Замена deposit(2)
            if (response.getDeposits().size() > 1) {
                //Замена code
                etalon.getDeposits().get(1).setCode(depositNoUncResponse.getDeposits().get(1).getProductId());
                //Замена percent
                etalon.getDeposits().get(1).setPercent(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
                //Замена income
                etalon.getDeposits().get(1).setIncome(mathLogicDeposit.logicPercent(request, depositNoUncResponse, 1));
                //Замена totalAmount
                etalon.getDeposits().get(1).setTotalAmount(request.getAmount() + etalon.getDeposits().get(1).getIncome());
                //Замена yield
                etalon.getDeposits().get(1).setYield(depositNoUncResponse.getDeposits().get(1).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate());
            }

        }
        /*if (etalon.getDeposits().size() > 1) {
            Collections.swap(etalon.getDeposits(), 0, 1);
            return etalon;
        }
        else {return etalon;}*/

        return etalon;

    }


}
