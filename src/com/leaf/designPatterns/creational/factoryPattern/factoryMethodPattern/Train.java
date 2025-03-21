package com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern;

public class Train implements Transport {
    @Override
    public void goHome() {
        System.out.println("go home by train");
    }
}
