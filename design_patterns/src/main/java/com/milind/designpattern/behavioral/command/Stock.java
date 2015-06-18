package com.milind.designpattern.behavioral.command;

/**
 * Created by deobhank on 6/18/2015.
 */
public class Stock {

    private String name;
    private  int qty;

    public Stock(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void  buy(){
        System.out.println("Buying the Stock: "+name);
    }

    public void  sell(){
        System.out.println("Selling the Stock: "+name);
    }
}
