package com.leaf.designPatterns.creational.prototypePattern;

/**
 * @author leshu
 * @since 2025/3/11 14:17
 **/
public class MacBook extends Computer {

    public MacBook() {
        brand = "Apple";
    }

    @Override
    public void printInfo() {
        System.out.println("macBook`s brand is " + brand + ", os is " + os);
    }
}
