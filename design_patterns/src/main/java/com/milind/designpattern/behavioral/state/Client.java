/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milind.designpattern.behavioral.state;

/**
 *
 * @author milind
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        StateContext ctx = new StateContext(new ArchitecturalState());
        while(ctx.executeStage()){
            System.out.println("Next State ...");
        }
        ctx = new StateContext(new DesignState());
        while(ctx.executeStage()){
            System.out.println("Next State ...");
        }
        
    }
    
}
