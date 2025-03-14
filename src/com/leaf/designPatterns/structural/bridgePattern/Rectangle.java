package com.leaf.designPatterns.structural.bridgePattern;

/**
 * @author leshu
 * @since 2025/3/12 16:45
 **/
public class Rectangle extends Shape {

    @Override
    public void draw() {
        color.coloring("长方形");
    }
}
