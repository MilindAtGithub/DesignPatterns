package com.milind.designpattern.creator.abstactfactory;

/**
 * Created by deobhank on 6/23/2015.
 */
public class Client {

    public static void  main (String args[]){

        AbstractFactory abstractFactory = new AbstractFactory();
        Shape shape = abstractFactory.getShape("Circle");
        shape.draw();
        shape = abstractFactory.getShape("Triangle");
        shape.draw();
    }

}
