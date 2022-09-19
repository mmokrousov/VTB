package mmokrousov.Model.GetDepositsAndSavingsAccounts.Request;

import java.util.ArrayList;
import java.util.List;

public class GetDepositsAndSavingsAccountsRequest {
    private long amount;
    private String channel;
    private String clientPackage;
    private String currency;
    private List<String> options = new ArrayList<>();
    private int term;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getClientPackage() {
        return clientPackage;
    }

    public void setClientPackage(String clientPackage) {
        this.clientPackage = clientPackage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
