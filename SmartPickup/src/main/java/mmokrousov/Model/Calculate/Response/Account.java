package mmokrousov.Model.Calculate.Response;

public class Account {
    private String number;
    private Balance balance = new Balance();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
}
