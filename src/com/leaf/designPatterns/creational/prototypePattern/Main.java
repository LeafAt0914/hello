package com.leaf.designPatterns.creational.prototypePattern;

/**
 * @author leshu
 * @since 2025/3/11 14:32
 **/
public class Main {

    public static void main(String[] args) {
        ComputerCache.createCache();

        Computer clonedMacBook = ComputerCache.getComputer("1");
        clonedMacBook.printInfo();

        Computer clonedMateBook = ComputerCache.getComputer("2");
        clonedMateBook.printInfo();
    }
}
