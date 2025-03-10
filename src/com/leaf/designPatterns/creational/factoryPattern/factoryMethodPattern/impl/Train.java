package com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern.impl;

import com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern.Transport;

/**
 * @author leshu
 * @since 2025/3/10 13:36
 **/
public class Train implements Transport {
    @Override
    public void goHome() {
        System.out.println("go home by train");
    }
}
