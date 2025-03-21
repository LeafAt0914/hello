package com.leaf.designPatterns.creational.prototypePattern;

public class MacBook extends Computer {

    public MacBook() {
        brand = "Apple";
    }

    @Override
    public void printInfo() {
        System.out.println("macBook`s brand is " + brand + ", os is " + os);
    }
}
