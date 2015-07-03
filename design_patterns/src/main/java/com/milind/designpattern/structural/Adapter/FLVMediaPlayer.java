package com.milind.designpattern.structural.Adapter;

/**
 * Created by deobhank on 7/3/2015.
 */
public class FLVMediaPlayer implements AdvanceMediaPlayer {
    @Override
    public void playMP3() {

    }

    @Override
    public void playflv() {
        System.out.println("Playing flv Media .. by flv media player");
    }
}
