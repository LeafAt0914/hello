package com.leaf.designPatterns.behavioral.strategyPattern;


public class StrategyA implements GoHomeStrategy {
    @Override
    public String goHome() {
        return "train";
    }
}
