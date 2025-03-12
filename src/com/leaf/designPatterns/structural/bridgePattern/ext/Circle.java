package com.leaf.designPatterns.structural.bridgePattern.ext;

import com.leaf.designPatterns.structural.bridgePattern.Shape;

/**
 * @author leshu
 * @since 2025/3/12 16:12
 **/
public class Circle extends Shape {

    @Override
    public void draw() {
        color.coloring("圆形");
    }
}
