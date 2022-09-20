package mmokrousov.Model.CalculateProduct.Request;

import java.util.List;

public class CalculateProductRequest {
    private int amount;
    private String channel;
    private String clientPackage;
    private String code;
    private String currency;
    private List<String> options;
    private int term;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
