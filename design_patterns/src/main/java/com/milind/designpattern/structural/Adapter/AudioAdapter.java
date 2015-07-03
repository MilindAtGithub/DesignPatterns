package com.milind.designpattern.structural.Adapter;

/**
 * Created by deobhank on 7/3/2015.
 */
public class AudioAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public void play(String audioType){
        if(audioType.equalsIgnoreCase("mp3"))
        new VLCMediaPlayer().playMP3();
        if(audioType.equalsIgnoreCase("flv"))
            new FLVMediaPlayer().playflv();
    }

}
