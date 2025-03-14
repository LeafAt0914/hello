package com.leaf.designPatterns.behavioral.commandPattern;

public class Main {

    public static void main(String[] args) {
        Stock cupStock = new Stock();

        BuyStock buyStock = new BuyStock(cupStock);
        SellStock sellStock = new SellStock(cupStock);

        Broker broker = new Broker();
        broker.takeCommand(buyStock);
        broker.takeCommand(sellStock);

        broker.invoke();
    }
}
