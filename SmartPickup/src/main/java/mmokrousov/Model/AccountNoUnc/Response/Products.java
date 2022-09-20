package mmokrousov.Model.AccountNoUnc.Response;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Rates> rates = new ArrayList<>();
    private Currency currency = new Currency();
    private double minAmount;
    private double maxAmount;


    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }
}
