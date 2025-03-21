package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public class Airplane implements Transport {
    @Override
    public void goHome() {
        System.out.println("go home by airplane");
    }
}
