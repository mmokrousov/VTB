package mmokrousov.Processor.MathLogicDepositAccount;

import mmokrousov.Model.DepositNoUnc.Response.DepositNoUncResponse;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Request.GetDepositsAndSavingsAccountsRequest;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;

import java.time.LocalDate;

public class MathLogicDeposit {

    public double logicYield(GetDepositsAndSavingsAccountsRequest request, double income){
        double yield = income / request.getAmount() / request.getTerm() * 365 * 100;
        String result = String.format("%.2f", yield);
        result = result.replace(',', '.');
        return Double.parseDouble(result);
    }

    public double logicPercentCapitalization(GetDepositsAndSavingsAccountsRequest request, DepositNoUncResponse depositNoUncResponse, int index){
        LocalDate date = LocalDate.now();
        int count = 0;
        int term = request.getTerm();
        double percent = depositNoUncResponse.getDeposits().get(index).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate();
        double percentSumm = 0;
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;

        while (term - date.plusMonths(count).lengthOfMonth() > 0){
            percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * percent/leapYear * date.plusMonths(count).lengthOfMonth();
            term = term - date.plusMonths(count).lengthOfMonth();
            count++;
        }
        percentSumm = percentSumm + (request.getAmount() + percentSumm)/100 * percent/leapYear * term;
        String result = String.format("%.2f", percentSumm);
        result = result.replace(',', '.');

        return Double.parseDouble(result);
    }

    public double logicPercent(GetDepositsAndSavingsAccountsRequest request, DepositNoUncResponse depositNoUncResponse, int index){
        LocalDate date = LocalDate.now();
        double percentSumm = 0;
        double percent = depositNoUncResponse.getDeposits().get(index).getProducts().get(0).getTerms().get(0).getRates().get(0).getNominalRate();
        int leapYear;
        if(date.isLeapYear() == true){
            leapYear = 366;
        }
        else leapYear = 365;
        percentSumm = request.getAmount() / 100 * percent / leapYear * request.getTerm();
        String result = String.format("%.2f", percentSumm);
        result = result.replace(',', '.');
        return Double.parseDouble(result);
    }

}
