package mmokrousov.Model.GetDepositsAndSavingsAccounts.Response;

import java.util.ArrayList;
import java.util.List;

public class GetDepositsAndSavingsAccountsResponse {
private List<Accounts> accounts = new ArrayList<>();
private List<Deposits> deposits = new ArrayList<>();
private String message;
private String field;
private List<Errors> errors;
private String error;

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<Deposits> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposits> deposits) {
        this.deposits = deposits;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Errors> getErrors() {
        return errors;
    }

    public void setErrors(List<Errors> errors) {
        this.errors = errors;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
