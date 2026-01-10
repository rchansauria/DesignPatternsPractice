package com.example.demo.factoryAssignment;

public class FLAC extends AudioPlayer{

    public FLAC(int volume, double playbackRate) {
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
        return MediaType.FLAC;
    }
}
