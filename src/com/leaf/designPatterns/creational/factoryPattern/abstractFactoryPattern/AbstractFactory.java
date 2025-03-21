package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

public abstract class AbstractFactory {

    public abstract Transport getGoHomeTransport(String transportType);

    public abstract NowDate getGoHomeDate(String nowDateType);
}
