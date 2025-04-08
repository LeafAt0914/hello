package com.leaf.designPatterns.structural.decoratorPattern;


public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: rectangle");
    }
}
