package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

/**
 * @author leshu
 * @since 2025/3/10 14:16
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (null == choice) {
            return null;
        } else if ("TRANSPORT".equals(choice)) {
            return new TransportFactory();
        } else if ("NOWDATE".equals(choice)) {
            return new NowDateFactory();
        }
        return null;
    }
}
