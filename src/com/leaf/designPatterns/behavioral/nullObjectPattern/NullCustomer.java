package com.leaf.designPatterns.behavioral.nullObjectPattern;


public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNul() {
        return true;
    }

    @Override
    public String getName() {
        return "No available customer";
    }
}
