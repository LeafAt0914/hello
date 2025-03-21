package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory transportFactory = FactoryProducer.getFactory("TRANSPORT");
        AbstractFactory nowDateFactory = FactoryProducer.getFactory("NOWDATE");

        Train train = (Train) transportFactory.getGoHomeTransport("TRAIN");
        train.goHome();
        Airplane airplane = (Airplane) transportFactory.getGoHomeTransport("AIRPLANE");
        airplane.goHome();
        Car car = (Car) transportFactory.getGoHomeTransport("CAR");
        car.goHome();

        OneDayLater oneDayLater = (OneDayLater) nowDateFactory.getGoHomeDate("oneDayLater");
        oneDayLater.goHome();
        TwoDaysLater twoDaysLater = (TwoDaysLater) nowDateFactory.getGoHomeDate("twoDaysLater");
        twoDaysLater.goHome();
        ThreeDaysLater threeDaysLater = (ThreeDaysLater) nowDateFactory.getGoHomeDate("threeDaysLater");
        threeDaysLater.goHome();
    }
}
