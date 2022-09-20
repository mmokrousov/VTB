package mmokrousov.Model.DepositNoUnc.Response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class Deposits {
    private String productId;
    private String productName;
    private String commCode;
    private String paymentSchedule;
    private String periodUnit;
    private boolean useInitialAmountMatrix;
    private boolean useIrreducibleBalanceMatrix;
    private String payType;
    private List<String> packages;
    private List<Products> products;
    private boolean isAdditionAvailable;
    private boolean isSubtractionAvailable;
    private boolean isProlongationEnable;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommCode() {
        return commCode;
    }

    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public String getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(String paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    public boolean getUseInitialAmountMatrix() {
        return useInitialAmountMatrix;
    }

    public void setUseInitialAmountMatrix(boolean useInitialAmountMatrix) {
        this.useInitialAmountMatrix = useInitialAmountMatrix;
    }

    public boolean getUseIrreducibleBalanceMatrix() {
        return useIrreducibleBalanceMatrix;
    }

    public void setUseIrreducibleBalanceMatrix(boolean useIrreducibleBalanceMatrix) {
        this.useIrreducibleBalanceMatrix = useIrreducibleBalanceMatrix;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public boolean getIsSubtractionAvailable() {
        return isSubtractionAvailable;
    }

    public void setSubtractionAvailable(boolean subtractionAvailable) {
        isSubtractionAvailable = subtractionAvailable;
    }

    public boolean getIsProlongationEnable() {
        return isProlongationEnable;
    }

    public void setProlongationEnable(boolean prolongationEnable) {
        isProlongationEnable = prolongationEnable;
    }

    public boolean getIsAdditionAvailable() {
        return isAdditionAvailable;
    }

    public void setAdditionAvailable(boolean additionAvailable) {
        isAdditionAvailable = additionAvailable;
    }
}
