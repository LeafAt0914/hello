package com.leaf.designPatterns.creational.builderPattern;

public class Director {

    private GoHomeByTrainBuilder goHomeByTrainBuilder;

    public Director() {
        this.goHomeByTrainBuilder = new GoHomeByTrainBuilder();
    }

    public GoHomeByTrain construct(String goDate, Float price, Boolean needIdCard) {
        goHomeByTrainBuilder.buildGoDate(goDate);
        goHomeByTrainBuilder.buildPrice(price);
        goHomeByTrainBuilder.buildNeedIdCard(needIdCard);
        return goHomeByTrainBuilder.build();
    }
}
