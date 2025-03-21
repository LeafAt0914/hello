package com.leaf.designPatterns.creational.factoryPattern.simpleFactoryPattern;


public class Main {
    public static void main(String[] args) {
        String transportType = "TRAIN";
        if ("TRAIN".equals(transportType)) {
            Train train = new Train();
            train.goHomeByTrain();
        }

        transportType = "AIRPLANE";
        if ("AIRPLANE".equals(transportType)) {
            AirPlane airPlane = new AirPlane();
            airPlane.goHomeByAirPlane();
        }

        transportType = "CAR";
        if ("CAR".equals(transportType)) {
            Car car = new Car();
            car.goHomeByCar();
        }

    }
}
