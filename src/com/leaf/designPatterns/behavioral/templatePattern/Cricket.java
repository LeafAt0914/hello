package com.leaf.designPatterns.behavioral.templatePattern;


public class Cricket extends Game {

    @Override
    void init() {
        System.out.println("Cricket Game initialized.");
    }

    @Override
    void start() {
        System.out.println("Cricket Game started.");
    }

    @Override
    void end() {
        System.out.println("Cricket Game ended.");
    }
}
