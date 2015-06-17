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
public class ProxyImage implements Image{
    
    RealImage rimage;

    public ProxyImage() {
        rimage = new RealImage();
    }

    @Override
    public void draw() {
        System.out.println("Generating the tools to draw image");
        rimage.draw();
        System.out.println("Destroying the tools as not needed now");
    }
    
}
