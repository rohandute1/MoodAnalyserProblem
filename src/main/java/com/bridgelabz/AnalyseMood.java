package com.bridgelabz;


class MoodAnalyserException extends Exception{
    public MoodAnalyserException(String message){
        super(message);
    }
}
public class AnalyseMood {
    String message;
    public AnalyseMood(String message){
        this.message = message;
    }
    AnalyseMood(){

    }
    public String happyOrSad(String message) {
        if(message.contains("Sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public String happyOrSadUsingConstructor() {
        if(message.contains("happy")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public String containsHappyGiveSad() {
        if (message.contains("happy")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }

    public String containsNullGiveHappy() {
        try {
            if (message.contains("Happy")) {
                return "HAPPY";

            } else {
                return "SAD";
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
        return "HAPPY";
    }

    public String containsNullGiveMoodAnalysisException() throws MoodAnalyserException{
        if (message == null || message.trim().isEmpty()) {
            throw new MoodAnalyserException("You have entered wrong mood");
        }
        // Your mood analysis logic goes here, for now, let's assume it always returns "HAPPY"
        return "HAPPY";
    }
}
