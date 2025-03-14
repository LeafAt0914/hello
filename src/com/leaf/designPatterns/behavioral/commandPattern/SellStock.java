package com.leaf.designPatterns.behavioral.commandPattern;

public class SellStock implements Command {

    private Stock cupStock;

    public SellStock(Stock cupStock) {
        this.cupStock = cupStock;
    }

    @Override
    public void execute() {
        cupStock.sell();
    }
}
