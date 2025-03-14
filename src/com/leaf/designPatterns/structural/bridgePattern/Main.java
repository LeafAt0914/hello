package com.leaf.designPatterns.structural.bridgePattern;

/**
 * @author leshu
 * @since 2025/3/12 16:19
 **/
public class Main {
    public static void main(String[] args) {
        Color white = new White();
        Shape circle = new Circle();
        circle.setColor(white);
        circle.draw();

        Color red = new Red();
        Shape rectangle = new Rectangle();
        rectangle.setColor(red);
        rectangle.draw();

        rectangle.setColor(white);
        rectangle.draw();
    }
}
