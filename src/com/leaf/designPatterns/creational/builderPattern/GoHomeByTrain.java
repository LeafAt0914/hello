package com.leaf.designPatterns.creational.builderPattern;

public class GoHomeByTrain {

    private String goDate;

    private Float price;

    private Boolean needIdCard;

    public void setGoDate(String goDate) {
        this.goDate = goDate;
    }

    public String getGoDate() {
        return goDate;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }

    public void setNeedIdCard(Boolean needIdCard) {
        this.needIdCard = needIdCard;
    }

    public String toString() {
        return "GoHomeByTrain{goDate=" + goDate +
                ",price=" + price +
                ",needIdCard=" + needIdCard +
                "}";
    }
}
