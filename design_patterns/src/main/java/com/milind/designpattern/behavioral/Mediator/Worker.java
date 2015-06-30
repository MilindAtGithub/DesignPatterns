package com.milind.designpattern.behavioral.Mediator;

/**
 * Created by deobhank on 6/30/2015.
 */
public abstract class Worker {

    private  Mediator mediator;

    public Worker(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void doWork();
}
