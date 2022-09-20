package mmokrousov.Model.CreateContract.Request;

public class CreateContractRequest {
    private boolean storage;
    private String metalNameIso;
    private String currencyNameIso;
    private Double rate;
    private int mass;
    private Double pureMass;
    private Double purchaseAmount;

    public boolean isStorage() {
        return storage;
    }

    public void setStorage(boolean storage) {
        this.storage = storage;
    }

    public String getMetalNameIso() {
        return metalNameIso;
    }

    public void setMetalNameIso(String metalNameIso) {
        this.metalNameIso = metalNameIso;
    }

    public String getCurrencyNameIso() {
        return currencyNameIso;
    }

    public void setCurrencyNameIso(String currencyNameIso) {
        this.currencyNameIso = currencyNameIso;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Double getPureMass() {
        return pureMass;
    }

    public void setPureMass(Double pureMass) {
        this.pureMass = pureMass;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
