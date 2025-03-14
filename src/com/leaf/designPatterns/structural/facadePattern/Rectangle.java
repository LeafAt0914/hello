package com.leaf.designPatterns.structural.facadePattern;

/**
 * @author leshu
 * @since 2025/3/13 14:50
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: rectangle");
    }
}
