package com.leaf.designPatterns.behavioral.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Command> orderList = new ArrayList<>();

    public void takeCommand(Command order) {
        orderList.add(order);
    }

    public void invoke() {
        for (Command order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
