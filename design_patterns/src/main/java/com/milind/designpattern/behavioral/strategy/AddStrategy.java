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
public class AddStrategy implements Strategy{

    @Override
    public int execute(int a, int b) {
        return a+b;
    }
    
}
