package com.milind.designpattern.structural.Adapter;

import com.milind.designpattern.creator.abstactfactory.AbstractFactory;

import java.sql.SQLOutput;

/**
 * Created by deobhank on 7/3/2015.
 */
public class VLCMediaPlayer implements AdvanceMediaPlayer{

    @Override
    public void playMP3() {
        System.out.println("Playing the MP3 File.. from VLC Media Player");
    }

    @Override
    public void playflv() {

    }
}
