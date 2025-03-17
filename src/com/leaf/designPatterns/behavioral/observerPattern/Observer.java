package com.leaf.designPatterns.behavioral.observerPattern;


public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
