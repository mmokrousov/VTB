package mmokrousov.Model.DepositNoUnc.Response;

import java.util.List;

public class Terms {
    private int minimumTerm;
    private int maximumTerm;
    private List<Rates> rates;

    public int getMinimumTerm() {
        return minimumTerm;
    }

    public void setMinimumTerm(int minimumTerm) {
        this.minimumTerm = minimumTerm;
    }

    public int getMaximumTerm() {
        return maximumTerm;
    }

    public void setMaximumTerm(int maximumTerm) {
        this.maximumTerm = maximumTerm;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }
}
