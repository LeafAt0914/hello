package com.leaf.designPatterns.behavioral.commandPattern;

public class Stock {

    private String name = "cup";

    private int quantity = 10;

    public void buy() {
        System.out.println("name: " + name +
                ", quantity: " + quantity +
                " bought.");
    }

    public void sell() {
        System.out.println("name: " + name +
                ", quantity: " + quantity +
                " sold.");
    }
}
