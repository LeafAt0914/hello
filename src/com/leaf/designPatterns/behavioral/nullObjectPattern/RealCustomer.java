package com.leaf.designPatterns.behavioral.nullObjectPattern;


public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNul() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
