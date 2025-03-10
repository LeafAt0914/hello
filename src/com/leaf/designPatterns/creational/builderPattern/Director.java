package com.leaf.designPatterns.creational.builderPattern;

import com.leaf.designPatterns.creational.builderPattern.ext.GoHomeByTrainBuilder;

/**
 * @author leshu
 * @since 2025/3/10 18:02
 **/
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
