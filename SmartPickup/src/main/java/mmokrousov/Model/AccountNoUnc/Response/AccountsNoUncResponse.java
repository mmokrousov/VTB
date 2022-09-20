package mmokrousov.Model.AccountNoUnc.Response;

import java.util.ArrayList;
import java.util.List;

public class AccountsNoUncResponse {
    private List <Accounts> accounts = new ArrayList<>();

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
