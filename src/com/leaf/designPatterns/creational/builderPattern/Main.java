package com.leaf.designPatterns.creational.builderPattern;

public class Main {

    public static GoHomeByTrain construct(GoHomeByTrainBuilder goHomeByTrainBuilder, String goDate, Float price, Boolean needIdCard) {
        goHomeByTrainBuilder.buildGoDate(goDate);
        goHomeByTrainBuilder.buildPrice(price);
        goHomeByTrainBuilder.buildNeedIdCard(needIdCard);
        return goHomeByTrainBuilder.build();
    }

    public static void main(String[] args) {
        GoHomeByTrainBuilder goHomeByTrainBuilder1 = new GoHomeByTrainBuilder();
        GoHomeByTrain goHomeByTrain1 = construct(goHomeByTrainBuilder1, "oneDayLater", 1111f, false);
        System.out.println(goHomeByTrain1);

        GoHomeByTrainBuilder goHomeByTrainBuilder2 = new GoHomeByTrainBuilder();
        GoHomeByTrain goHomeByTrain2 = construct(goHomeByTrainBuilder2, null, 999f, false);
        System.out.println(goHomeByTrain2);

        GoHomeByTrainBuilder goHomeByTrainBuilder3 = new GoHomeByTrainBuilder();
        GoHomeByTrain goHomeByTrain3 = construct(goHomeByTrainBuilder3, "oneDayLater", 999f, true);
        System.out.println(goHomeByTrain3);
    }
}
