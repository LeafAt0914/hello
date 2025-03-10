package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.impl;

import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.NowDate;

/**
 * @author leshu
 * @since 2025/3/10 14:03
 **/
public class ThreeDaysLater implements NowDate {
    @Override
    public void goHome() {
        System.out.println("go home three days later");
    }
}
