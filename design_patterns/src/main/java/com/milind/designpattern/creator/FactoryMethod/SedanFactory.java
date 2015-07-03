package com.milind.designpattern.creator.FactoryMethod;

/**
 * Created by deobhank on 7/1/2015.
 */
public class SedanFactory implements  CarFactory {
    @Override
    public Car makeCar() {
        return new SedanCar();
    }
}
