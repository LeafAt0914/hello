package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.ext;


import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.NowDate;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.Transport;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.impl.Airplane;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.impl.Car;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.impl.Train;
import com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern.AbstractFactory;

/**
 * @author leshu
 * @since 2025/3/10 14:09
 **/
public class TransportFactory extends AbstractFactory {
    @Override
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

    @Override
    public NowDate getGoHomeDate(String nowDateType) {
        return null;
    }
}
