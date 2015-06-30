package com.milind.designpattern.behavioral.Mediator;

import java.util.LinkedList;

/**
 * Created by deobhank on 6/30/2015.
 */
public class ConcereteMediator implements  Mediator {

    private LinkedList<Object> list;

    public ConcereteMediator() {
        this.list = new LinkedList<Object>();
    }

    @Override
    public void add(Object obj) {

        list.add(obj);
    }

    @Override
    public Object get() {
        return list.remove();
    }
}
