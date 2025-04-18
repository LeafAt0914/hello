package com.leaf.designPatterns.creational.builderPattern;

public class GoHomeByTrainBuilder extends Builder {

    GoHomeByTrain goHome;

    public GoHomeByTrainBuilder() {
        goHome = new GoHomeByTrain();
    }

    @Override
    public void buildGoDate(String goDate) {
        goHome.setGoDate(goDate);
    }

    @Override
    public void buildPrice(Float price) {
        goHome.setPrice(price);
    }

    @Override
    public void buildNeedIdCard(Boolean needIdCard) {
        goHome.setNeedIdCard(needIdCard);
    }

    @Override
    public GoHomeByTrain build() {
        if (goHome.getPrice() > 1000) {
            System.out.println("go home by train price cannot exceed 1000");
            return null;
        }
        if (goHome.getGoDate() == null) {
            System.out.println("go date cannot be null");
            return null;
        }
        return goHome;
    }
}
