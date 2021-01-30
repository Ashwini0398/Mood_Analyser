package com.MoodAnalyser;

public class MoodAnalyser {
    private String message;


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
