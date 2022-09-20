package mmokrousov.Model.AccountNoUnc.Response;

public class Currency {
    private String name;
    private String alphaCode;
    private int numericCode;
    private int round;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlphaCode() {
        return alphaCode;
    }

    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
