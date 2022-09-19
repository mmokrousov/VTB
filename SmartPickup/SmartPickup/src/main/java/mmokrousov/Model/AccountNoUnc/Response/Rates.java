package mmokrousov.Model.AccountNoUnc.Response;

public class Rates {
    private int termTo;
    private double accountRate;

    public int getTermTo() {
        return termTo;
    }

    public void setTermTo(int termTo) {
        this.termTo = termTo;
    }

    public double getAccountRate() {
        return accountRate;
    }

    public void setAccountRate(double accountRate) {
        this.accountRate = accountRate;
    }
}
