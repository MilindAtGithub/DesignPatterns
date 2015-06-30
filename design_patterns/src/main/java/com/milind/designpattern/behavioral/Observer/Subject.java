package com.milind.designpattern.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deobhank on 6/30/2015.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public Subject(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
        updateAll();
    }

    private String topic;

    public void addObserver(Observer observer1){
        observers.add(observer1);
    }

    private void updateAll(){

        for (Observer observer : observers){
            observer.update();
        }
    }


}
