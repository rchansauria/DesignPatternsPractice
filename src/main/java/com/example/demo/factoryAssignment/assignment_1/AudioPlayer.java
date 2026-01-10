package com.example.demo.factoryAssignment;

public abstract class AudioPlayer {

    private int volume;
    private double playbackRate;

    public AudioPlayer(int volume, double playbackRate) {
        this.volume = volume;
        this.playbackRate = playbackRate;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }
        this.volume = volume;
    }

    public double getPlaybackRate() {
        return playbackRate;
    }

    public void setPlaybackRate(double playbackRate) {
        this.playbackRate = playbackRate;
    }

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public abstract MediaType supportedType();

    public static AudioPlayer of(MediaType audioType, double playbackRate,  int volume) {
        return AudioFactory.getAudio(audioType, playbackRate, volume);
    }
}
