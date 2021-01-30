package com.MoodAnalyser;

public class MoodAnalyser {

    private String message;


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyzeMood() {
	try
	{
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
	}
	catch(NullPointerException e)
	{
		return "happy";
	}
    }
}
