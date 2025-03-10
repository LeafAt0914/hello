package com.leaf.designPatterns.creational.builderPattern;

/**
 * @author leshu
 * @since 2025/3/10 17:31
 **/
public abstract class Builder {

    public abstract void buildGoDate(String goDate);
    public abstract void buildPrice(Float price);
    public abstract void buildNeedIdCard(Boolean needIdCard);
    public abstract GoHomeByTrain build();
}
