package com.leaf.designPatterns.structural.decoratorPattern;

import com.leaf.designPatterns.structural.decoratorPattern.ext.RedShapeDecorator;
import com.leaf.designPatterns.structural.decoratorPattern.impl.Circle;
import com.leaf.designPatterns.structural.decoratorPattern.impl.Rectangle;

/**
 * @author leshu
 * @since 2025/3/13 14:38
 **/
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
