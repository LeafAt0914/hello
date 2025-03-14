package com.leaf.designPatterns.behavioral.mementoPattern;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state 1");
        originator.setState("state 2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state 3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state 4");

        System.out.println("current state: " + originator.getState());
        System.out.println("previous saved state: " + careTaker.get(1).getState());
        System.out.println("previous previous saved state: " + careTaker.get(0).getState());
    }
}
