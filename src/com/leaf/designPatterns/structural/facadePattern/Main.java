package com.leaf.designPatterns.structural.facadePattern;

/**
 * @author leshu
 * @since 2025/3/13 14:56
 **/
public class Main {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
        shapeMaker.drawTriangle();
    }
}
