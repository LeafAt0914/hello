package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.NowDate;

/**
 * @author leshu
 * @since 2025/3/10 14:03
 **/
public class TwoDaysLater implements NowDate {
    @Override
    public void goHome() {
        System.out.println("go home two days later");
    }
}
