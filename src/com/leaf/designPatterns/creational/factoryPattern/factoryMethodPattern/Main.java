package com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern;

/**
 * @author leshu
 * @since 2025/3/10 13:32
 **/
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
