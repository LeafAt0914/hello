package com.leaf.designPatterns.structural.decoratorPattern;

/**
 * @author leshu
 * @since 2025/3/13 14:31
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: circle");
    }
}
