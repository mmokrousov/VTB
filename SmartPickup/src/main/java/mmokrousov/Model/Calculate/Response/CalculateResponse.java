package mmokrousov.Model.Calculate.Response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

public class CalculateResponse {

    private double cost;
    private double offer;
    private double minSum;
    private double maxSum;
    private List<Account> account = new ArrayList<>();
    private String errorCode;
    private String message;
    private String traceId;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }

    public double getMinSum() {
        return minSum;
    }

    public void setMinSum(double minSum) {
        this.minSum = minSum;
    }

    public double getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(double maxSum) {
        this.maxSum = maxSum;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
