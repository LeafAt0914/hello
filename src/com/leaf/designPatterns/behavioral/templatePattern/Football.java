package com.leaf.designPatterns.behavioral.templatePattern;


public class Football extends Game {
    @Override
    void init() {
        System.out.println("Football Game initialized.");
    }

    @Override
    void start() {
        System.out.println("Football Game started.");
    }

    @Override
    void end() {
        System.out.println("Football Game ended.");
    }
}
