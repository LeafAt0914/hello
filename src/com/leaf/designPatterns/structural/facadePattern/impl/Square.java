package com.leaf.designPatterns.structural.facadePattern.impl;

import com.leaf.designPatterns.structural.facadePattern.Shape;

/**
 * @author leshu
 * @since 2025/3/13 14:51
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("shape: square");
    }
}
