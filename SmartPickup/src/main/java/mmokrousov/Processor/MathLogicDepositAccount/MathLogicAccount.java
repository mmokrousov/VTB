package mmokrousov.Processor.MathLogicDepositAccount;

import mmokrousov.Model.AccountNoUnc.Response.AccountsNoUncResponse;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Request.GetDepositsAndSavingsAccountsRequest;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;

import java.time.LocalDate;

public class MathLogicAccount {

    public double logicYield(GetDepositsAndSavingsAccountsRequest request, GetDepositsAndSavingsAccountsResponse response, int index){
        double yield = response.getAccounts().get(index).getIncome() / request.getAmount() / request.getTerm() * 365 * 100;
        String result = String.format("%.2f", yield);
        result = result.replace(',', '.');
        return Double.parseDouble(result);
    }


    public double logicPercentCapitalization(GetDepositsAndSavingsAccountsRequest request, GetDepositsAndSavingsAccountsResponse response, int indexResponse){
        LocalDate date = LocalDate.now();
        int count = 0;
        int term = request.getTerm();
        double percentSumm = 0;
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;

            while (term - date.plusMonths(count).lengthOfMonth() > 0) {
                percentSumm = percentSumm + (request.getAmount() + percentSumm) / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * date.plusMonths(count).lengthOfMonth();
                term = term - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            percentSumm = percentSumm + (request.getAmount() + percentSumm) / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * term;
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);

    }

    public double logicPercent(GetDepositsAndSavingsAccountsRequest request, GetDepositsAndSavingsAccountsResponse response, int indexResponse){
        LocalDate date = LocalDate.now();
        double percentSumm = 0;
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;
        percentSumm = request.getAmount() / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * request.getTerm();
        String result = String.format("%.2f", percentSumm);
        result = result.replace(',', '.');
        return Double.parseDouble(result);
    }

    public double logicPercentWelcome(GetDepositsAndSavingsAccountsRequest request, GetDepositsAndSavingsAccountsResponse response, int indexMarket, int indexResponse, AccountsNoUncResponse accountsNoUncResponse){
        LocalDate date = LocalDate.now();
        int count = 0;
        double percentSumm = 0;
        int term = request.getTerm();
        int termWelcome = 0;
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;
        //Вычисляем количество дней welcome периода
        while (accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getTermTo() != count){
            termWelcome = termWelcome + date.plusMonths(count).lengthOfMonth();
            count++;
        }
        count = 0;
        //Условие расчет относительно welcome периода
        if(request.getAmount() > 999999.9){
            percentSumm = request.getAmount() / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * request.getTerm();
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');
            return Double.parseDouble(result);
        }

        if(termWelcome >= term){

            percentSumm = request.getAmount() / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * request.getTerm();
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }
        else {
            percentSumm = (request.getAmount() / 100 * response.getAccounts().get(indexResponse).getPercent() / leapYear * termWelcome) +
                    (request.getAmount() / 100 * accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getAccountRate()/leapYear * (term - termWelcome));

            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }

    }

    public double logicPercentWelcomeCapitalization(GetDepositsAndSavingsAccountsRequest request, GetDepositsAndSavingsAccountsResponse response, int indexMarket, int indexResponse, AccountsNoUncResponse accountsNoUncResponse){
        LocalDate date = LocalDate.now();
        int count = 0;
        double percentSumm = 0;
        int term = request.getTerm();
        int termWelcome = 0;
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;

        //Вычисляем количество дней welcome периода
        while (accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getTermTo() != count){
            termWelcome = termWelcome + date.plusMonths(count).lengthOfMonth();
            count++;
        }
        count = 0;
        //Условие расчет относительно welcome периода

        if(request.getAmount() > 999999.9){
            while (term - date.plusMonths(count).lengthOfMonth() > 0){
                percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * date.plusMonths(count).lengthOfMonth();
                term = term - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * term;
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }

        if(termWelcome == term){
            while (termWelcome != 0){
                percentSumm = percentSumm + ((request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * date.plusMonths(count).lengthOfMonth());
                termWelcome = termWelcome - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }

        else if(termWelcome > term){

            while (term - date.plusMonths(count).lengthOfMonth() > 0){
                percentSumm = percentSumm + ((request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * date.plusMonths(count).lengthOfMonth());
                term = term - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            percentSumm = percentSumm + ((request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * (term));
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }
        else {
            //Расчет велком части
            while (accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getTermTo() != count){
                percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * response.getAccounts().get(indexResponse).getPercent()/leapYear * date.plusMonths(count).lengthOfMonth();
                term = term - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            //Расчет без велком части
            while (term - date.plusMonths(count).lengthOfMonth() > 0){
                percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getAccountRate()/leapYear * date.plusMonths(count).lengthOfMonth();
                term = term - date.plusMonths(count).lengthOfMonth();
                count++;
            }
            //Расчет с остатком дней
            percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * accountsNoUncResponse.getAccounts().get(indexMarket).getProducts().get(0).getRates().get(1).getAccountRate()/leapYear * term;
            String result = String.format("%.2f", percentSumm);
            result = result.replace(',', '.');

            return Double.parseDouble(result);
        }
    }

}
