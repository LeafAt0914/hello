package com.leaf.designPatterns.behavioral.strategyPattern;


public class Main {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        System.out.println("go home by " + context.goHome());

        context = new Context(new StrategyB());
        System.out.println("go home by " + context.goHome());
    }
}
