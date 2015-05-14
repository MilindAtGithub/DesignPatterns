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
public class ArchitecturalState implements SprintState{

    @Override
    public void process(StateContext ctx) {
        System.out.println("Executing the Architectural Stage ..");
        ctx.setState(new DesignState());
    }
    
}
