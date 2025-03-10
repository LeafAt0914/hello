package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

/**
 * @author leshu
 * @since 2025/3/10 14:07
 **/
public abstract class AbstractFactory {

    public abstract Transport getGoHomeTransport(String transportType);

    public abstract NowDate getGoHomeDate(String nowDateType);
}
