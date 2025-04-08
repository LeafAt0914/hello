package com.leaf.designPatterns.structural.decoratorPattern;


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
