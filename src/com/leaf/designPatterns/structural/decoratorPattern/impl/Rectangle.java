package com.leaf.designPatterns.structural.decoratorPattern.impl;

import com.leaf.designPatterns.structural.decoratorPattern.Shape;

/**
 * @author leshu
 * @since 2025/3/13 14:30
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: rectangle");
    }
}
