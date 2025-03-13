package com.leaf.designPatterns.structural.decoratorPattern;

/**
 * @author leshu
 * @since 2025/3/13 14:32
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
