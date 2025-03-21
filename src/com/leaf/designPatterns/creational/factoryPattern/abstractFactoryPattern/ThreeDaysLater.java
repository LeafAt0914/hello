package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public class ThreeDaysLater implements NowDate {
    @Override
    public void goHome() {
        System.out.println("go home three days later");
    }
}
