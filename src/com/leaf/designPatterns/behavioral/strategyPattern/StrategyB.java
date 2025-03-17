package com.leaf.designPatterns.behavioral.strategyPattern;


public class StrategyB implements GoHomeStrategy {
    @Override
    public String goHome() {
        return "airplane";
    }
}
