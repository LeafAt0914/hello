package com.leaf.designPatterns.creational.builderPattern;

/**
 * @author leshu
 * @since 2025/3/10 17:55
 **/
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        GoHomeByTrain goHomeByTrain1 = director.construct("oneDayLater", 1111f, false);
        System.out.println(goHomeByTrain1);

        GoHomeByTrain goHomeByTrain2 = director.construct(null, 999f, false);
        System.out.println(goHomeByTrain2);

        GoHomeByTrain goHomeByTrain3 = director.construct("oneDayLater", 999f, true);
        System.out.println(goHomeByTrain3);
    }
}
