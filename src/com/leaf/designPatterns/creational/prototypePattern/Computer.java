package com.leaf.designPatterns.creational.prototypePattern;

public abstract class Computer implements Cloneable {

    private String id;

    protected String brand;

    protected String os;

    public abstract void printInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
