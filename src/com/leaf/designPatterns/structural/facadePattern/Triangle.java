package com.leaf.designPatterns.structural.facadePattern;

/**
 * @author leshu
 * @since 2025/3/13 14:52
 **/
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape: triangle");
    }
}
