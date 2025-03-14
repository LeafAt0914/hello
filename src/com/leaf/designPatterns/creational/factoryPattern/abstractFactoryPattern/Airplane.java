package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

/**
 * @author leshu
 * @since 2025/3/10 13:37
 **/
public class Airplane implements Transport {
    @Override
    public void goHome() {
        System.out.println("go home by airplane");
    }
}
