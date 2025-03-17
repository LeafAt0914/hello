package com.leaf.designPatterns.behavioral.nullObjectPattern;


public class CustomerFactory {

    public static final String[] names = {"Alice", "Bob", "Jhon"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equals(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
