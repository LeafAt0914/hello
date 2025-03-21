package com.leaf.designPatterns.creational.prototypePattern;

public class Main {

    public static void main(String[] args) {
        ComputerCache.createCache();

        Computer clonedMacBook = ComputerCache.getComputer("1");
        clonedMacBook.printInfo();

        Computer clonedMateBook = ComputerCache.getComputer("2");
        clonedMateBook.printInfo();
    }
}
