package com.milind.designpattern.behavioral.Observer;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Observer1  extends  Observer {

    public Observer1(Subject subject) {
        super(subject);
        getSubject().addObserver(this);
    }

    public void update(){

        System.out.printf("From Observer1 ... ");
    }
}
