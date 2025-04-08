package com.leaf.designPatterns.structural.decoratorPattern;


public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        System.out.println();
        redCircle.draw();
        System.out.println();
        redRectangle.draw();
    }
}
