package com.leaf.designPatterns.structural.decoratorPattern.ext;

import com.leaf.designPatterns.structural.decoratorPattern.Shape;
import com.leaf.designPatterns.structural.decoratorPattern.ShapeDecorator;

/**
 * @author leshu
 * @since 2025/3/13 14:34
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("border color: red");
    }
}
