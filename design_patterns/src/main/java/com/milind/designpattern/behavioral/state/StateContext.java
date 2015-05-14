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
public class StateContext {
    
    private SprintState state;

    public void setState(SprintState state) {
        this.state = state;
    }

    public StateContext(SprintState state) {
        this.state = state;
    }
    
    public boolean executeStage(){
        
        state.process(this);  
        
        if(state == null){
            return false;
        }else {
            return true;
        }
      
    }
    
    
    
    
}
