package mmokrousov.Model.GetDocument.Request;

public class Info {
    private String account;
    private String idContract;
    private Double course;
    private Integer weight;
    private Integer quantity;
    private Double chemicalWeight;
    private Double purchaseAmount;
    private String typeIngots;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getChemicalWeight() {
        return chemicalWeight;
    }

    public void setChemicalWeight(Double chemicalWeight) {
        this.chemicalWeight = chemicalWeight;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getTypeIngots() {
        return typeIngots;
    }

    public void setTypeIngots(String typeIngots) {
        this.typeIngots = typeIngots;
    }
}
