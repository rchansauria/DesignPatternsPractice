package com.example.demo.factoryAssignment;

public class MP3 extends AudioPlayer{

    public MP3(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public MediaType supportedType() {
        return MediaType.MP3;
    }
}
