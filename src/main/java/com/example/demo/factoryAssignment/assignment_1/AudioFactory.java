package com.example.demo.factoryAssignment;

import java.util.Map;
import java.util.function.BiFunction;

public class AudioFactory {

    public static final Map<MediaType, BiFunction<Integer, Double, AudioPlayer>> audioRegistry = Map.of(
            MediaType.MP3, MP3::new,
            MediaType.WAV, WAV::new,
            MediaType.FLAC, FLAC::new
    );

    public static AudioPlayer getAudio(MediaType audioType, double playbackRate, int volume){
        BiFunction<Integer, Double, AudioPlayer> creator = audioRegistry.get(audioType);
        if(creator == null){
            throw new IllegalArgumentException("Unsupported audio type: " + audioType);
        }
        return creator.apply(volume, playbackRate);
    }
}
