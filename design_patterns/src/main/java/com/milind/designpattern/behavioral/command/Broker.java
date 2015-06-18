package com.milind.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deobhank on 6/18/2015.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
