package com.milind.designpattern.structural.Adapter;

/**
 * Created by deobhank on 7/3/2015.
 */
public class AudioPlayer implements  MediaPlayer {

    AudioAdapter audioAdapter = new AudioAdapter();
    @Override
    public void play(String audioType) {
        audioAdapter.play(audioType);
    }
}
