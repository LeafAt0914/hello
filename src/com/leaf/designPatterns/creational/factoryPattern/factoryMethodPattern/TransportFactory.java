package com.leaf.designPatterns.creational.factoryPattern.factoryMethodPattern;

/**
 * @author leshu
 * @since 2025/3/10 13:38
 **/
public class TransportFactory {

    public Transport getGoHomeTransport(String transportType) {
        if (null == transportType) {
            return null;
        } else if ("TRAIN".equals(transportType)) {
            return new Train();
        } else if ("AIRPLANE".equals(transportType)) {
            return new Airplane();
        } else if ("CAR".equals(transportType)) {
            return new Car();
        }
        return null;
    }
}
