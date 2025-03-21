package com.leaf.designPatterns.creational.prototypePattern;

public class MateBook extends Computer {

    public MateBook() {
        brand = "Huawei";
    }

    @Override
    public void printInfo() {
        System.out.println("mateBook`s brand is " + brand + ", os is " + os);
    }
}
