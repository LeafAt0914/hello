package com.leaf.designPatterns.behavioral.observerPattern;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
}
