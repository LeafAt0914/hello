package com.leaf.designPatterns.creational.builderPattern;

public abstract class Builder {

    public abstract void buildGoDate(String goDate);
    public abstract void buildPrice(Float price);
    public abstract void buildNeedIdCard(Boolean needIdCard);
    public abstract GoHomeByTrain build();
}
