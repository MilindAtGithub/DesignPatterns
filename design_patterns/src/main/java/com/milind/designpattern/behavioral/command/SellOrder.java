package com.milind.designpattern.behavioral.command;

/**
 * Created by deobhank on 6/18/2015.
 */
public class SellOrder implements Order {

    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        stock.sell();
    }
}
