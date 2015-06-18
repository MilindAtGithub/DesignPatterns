package com.milind.designpattern.behavioral.command;

/**
 * Created by deobhank on 6/18/2015.
 */
public class BuyOrder implements  Order{

    private  Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        stock.buy();
    }
}
