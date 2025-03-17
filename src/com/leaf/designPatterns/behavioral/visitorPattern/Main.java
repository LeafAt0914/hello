package com.leaf.designPatterns.behavioral.visitorPattern;


public class Main {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
