package com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Train train = (Train) transportFactory.getGoHomeTransport("TRAIN");
        train.goHome();
        Airplane airplane = (Airplane) transportFactory.getGoHomeTransport("AIRPLANE");
        airplane.goHome();
        Car car = (Car) transportFactory.getGoHomeTransport("CAR");
        car.goHome();
    }
}
