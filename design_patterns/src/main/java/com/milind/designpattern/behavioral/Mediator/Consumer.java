package com.milind.designpattern.behavioral.Mediator;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Consumer extends Worker {

    public Consumer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doWork() {
        System.out.println("Consuming: "+getMediator().get());
    }
}
