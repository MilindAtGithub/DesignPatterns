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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int a = 5;
        int b = 7;
        Context ctx = new Context(new AddStrategy());
        System.out.println(ctx.executeStrategy(a, b));
        ctx = new Context(new MultiplyStrategy());
        System.out.println(ctx.executeStrategy(a, b));
    }
    
}
