package com.milind.designpattern.creator.FactoryMethod;

/**
 * Created by deobhank on 7/1/2015.
 */
public class Client {

    public static void  main(String args[]){

        SedanFactory sedanFactory = new SedanFactory();
        Car car = sedanFactory.makeCar();
        System.out.println(car.getType());
    }
}
