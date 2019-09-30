package codegym.model;

public class MoneyConvert {
    private Double rate;
    private Double usd;


    public MoneyConvert() {
    }

    public MoneyConvert(Double rate, Double usd) {
        this.rate = rate;
        this.usd = usd;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }
}
