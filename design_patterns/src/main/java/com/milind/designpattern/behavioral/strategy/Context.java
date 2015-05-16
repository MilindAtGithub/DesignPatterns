/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milind.designpattern.behavioral.strategy;

/**
 *
 * @author deobhank
 */
public class Context {
    
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }
    
}
