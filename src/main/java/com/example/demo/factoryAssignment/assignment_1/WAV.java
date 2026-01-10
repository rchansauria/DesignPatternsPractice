package com.example.demo.factoryAssignment;

public class WAV extends AudioPlayer{

    public WAV(int volume, double playbackRate) {
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
        return MediaType.WAV;
    }
}
