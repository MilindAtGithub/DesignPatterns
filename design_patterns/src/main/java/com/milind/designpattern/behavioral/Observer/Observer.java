package com.milind.designpattern.behavioral.Observer;

/**
 * Created by deobhank on 6/30/2015.
 */
public abstract class Observer {

    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public abstract void update();
}
