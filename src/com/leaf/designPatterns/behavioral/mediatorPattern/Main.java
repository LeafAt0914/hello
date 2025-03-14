package com.leaf.designPatterns.behavioral.mediatorPattern;

public class Main {

    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        User jhon = new User("Jhon");

        alice.sendMessage("hello everyone!");
        bob.sendMessage("hello Alice.");
        jhon.sendMessage("hello Alice.");
    }
}
