package com.milind.designpattern.behavioral.command;

/**
 * Created by deobhank on 6/18/2015.
 */
public class Main {

    public static void main(String args[]){

        BuyOrder buyOrder = new BuyOrder(new Stock("Google",100));
        SellOrder sellOrder = new SellOrder(new Stock("Altisource",10000));

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.placeOrders();
    }
}
