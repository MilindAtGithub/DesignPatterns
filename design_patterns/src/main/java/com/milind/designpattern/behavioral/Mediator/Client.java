package com.milind.designpattern.behavioral.Mediator;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Client {

    public static void main( String args[]){

        Mediator mediator = new ConcereteMediator();

        Producer producer = new Producer(mediator," From Producer");
        Consumer consumer = new Consumer(mediator);
        producer.doWork();
        consumer.doWork();
    }
}
