package mmokrousov.Model.DepositNoUnc.Response;

import java.util.List;

public class Products {
    private Currency currency;
    private List<Terms> terms;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public List<Terms> getTerms() {
        return terms;
    }

    public void setTerms(List<Terms> terms) {
        this.terms = terms;
    }
}
