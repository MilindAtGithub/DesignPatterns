package com.milind.designpattern.creator.abstactfactory;

/**
 * Created by deobhank on 6/23/2015.
 */
public class AbstractFactory {


    /**
     * This will get the shape
     * @param str
     * @return
     */
    public Shape getShape(String str) {

        if(str.equalsIgnoreCase("Circle")){
            return new Circle();
        } if(str.equalsIgnoreCase("Triangle")){
            return  new Triangle();
        }else {
            return null;
        }
    }
}
