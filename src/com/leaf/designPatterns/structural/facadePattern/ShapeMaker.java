package com.leaf.designPatterns.structural.facadePattern;

import com.leaf.designPatterns.structural.facadePattern.impl.Rectangle;
import com.leaf.designPatterns.structural.facadePattern.impl.Square;
import com.leaf.designPatterns.structural.facadePattern.impl.Triangle;

/**
 * @author leshu
 * @since 2025/3/13 14:53
 **/
public class ShapeMaker {

    private Shape square;

    private Shape triangle;

    private Shape rectangle;

    public ShapeMaker() {
        square = new Square();
        triangle = new Triangle();
        rectangle = new Rectangle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
