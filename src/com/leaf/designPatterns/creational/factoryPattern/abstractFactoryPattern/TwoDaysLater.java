package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public class TwoDaysLater implements NowDate {
    @Override
    public void goHome() {
        System.out.println("go home two days later");
    }
}
