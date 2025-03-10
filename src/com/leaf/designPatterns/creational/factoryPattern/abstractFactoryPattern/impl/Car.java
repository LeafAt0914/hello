package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.impl;

import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.Transport;

/**
 * @author leshu
 * @since 2025/3/10 13:47
 **/
public class Car implements Transport {
    @Override
    public void goHome() {
        System.out.println("go home by car");
    }
}
