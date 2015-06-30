package com.milind.designpattern.behavioral.Observer;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Main {

    public static void main(String args[]){

        Subject subject = new Subject("Topic1");
        Observer1 observer1 = new Observer1(subject);
        Observer2  observer2 = new Observer2(subject);
        subject.setTopic("Topic2");
        subject.setTopic("Topic3");
    }
}
