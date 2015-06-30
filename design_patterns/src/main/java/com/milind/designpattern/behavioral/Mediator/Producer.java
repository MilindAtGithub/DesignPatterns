package com.milind.designpattern.behavioral.Mediator;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Producer extends Worker {

    private Object object;

    public Producer(Mediator mediator, Object object) {
        super(mediator);
        this.object = object;
    }

    @Override
    public void doWork() {
        getMediator().add(this.object);
    }


}
