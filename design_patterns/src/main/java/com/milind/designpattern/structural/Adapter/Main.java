package com.milind.designpattern.structural.Adapter;

/**
 * Created by deobhank on 7/3/2015.
 */
public class Main {

    public static void main(String args[]){

        AudioPlayer player = new AudioPlayer();
        player.play("mp3");
        player.play("flv");
    }
}
