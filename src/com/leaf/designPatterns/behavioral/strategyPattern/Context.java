package com.leaf.designPatterns.behavioral.strategyPattern;


public class Context {

    private GoHomeStrategy goHomeStrategy;

    public Context(GoHomeStrategy goHomeStrategy) {
        this.goHomeStrategy = goHomeStrategy;
    }

    public String goHome() {
        return goHomeStrategy.goHome();
    }
}
