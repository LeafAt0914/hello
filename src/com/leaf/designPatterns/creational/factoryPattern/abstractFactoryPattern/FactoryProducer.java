package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.ext.NowDateFactory;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.ext.TransportFactory;

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
