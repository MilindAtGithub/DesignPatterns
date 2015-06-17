/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milind.designpattern.structural.proxy;

/**
 *
 * @author deobhank
 */
public class RealImage implements Image{

    @Override
    public void draw() {
        
        System.out.println("Drawing the Image .....");
    }
    
}
