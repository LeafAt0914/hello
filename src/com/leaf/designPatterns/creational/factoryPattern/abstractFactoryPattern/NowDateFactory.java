package com.leaf.designPatterns.creational.factoryPattern.abstractFactoryPattern;

/**
 * @author leshu
 * @since 2025/3/10 14:12
 **/
public class NowDateFactory extends AbstractFactory {
    @Override
    public Transport getGoHomeTransport(String transportType) {
        return null;
    }

    @Override
    public NowDate getGoHomeDate(String nowDateType) {
        if (null == nowDateType) {
            return null;
        } else if ("oneDayLater".equals(nowDateType)) {
            return new OneDayLater();
        } else if ("twoDaysLater".equals(nowDateType)) {
            return new TwoDaysLater();
        } else if ("threeDaysLater".equals(nowDateType)) {
            return new ThreeDaysLater();
        }
        return null;
    }
}
