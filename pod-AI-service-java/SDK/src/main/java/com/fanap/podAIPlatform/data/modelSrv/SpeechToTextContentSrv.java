package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeechToTextContentSrv {
    @JsonProperty("text")
    private String text;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("phonetic")
    private String Phonetic;

    public String getPhonetic() {
        return Phonetic;
    }

    public void setPhonetic(String phonetic) {
        Phonetic = phonetic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
