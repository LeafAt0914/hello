package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public class OneDayLater implements NowDate {
    @Override
    public void goHome() {
        System.out.println("go home one day later");
    }
}
