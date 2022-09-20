package mmokrousov.Comparator;

import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class GetDepositsAndSavingsAccountsComparator implements IComparator<GetDepositsAndSavingsAccountsResponse>{
    public void compare(GetDepositsAndSavingsAccountsResponse response, GetDepositsAndSavingsAccountsResponse etalon){
        assertThat(response)
                .usingRecursiveComparison().
                ignoringFields("")
                .isEqualTo(etalon);
    }

}
