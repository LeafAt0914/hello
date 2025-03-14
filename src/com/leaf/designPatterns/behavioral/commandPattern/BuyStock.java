package com.leaf.designPatterns.behavioral.commandPattern;

public class BuyStock implements Command {

    private Stock cupStock;

    public BuyStock(Stock cupStock) {
        this.cupStock = cupStock;
    }

    @Override
    public void execute() {
        cupStock.buy();
    }
}
