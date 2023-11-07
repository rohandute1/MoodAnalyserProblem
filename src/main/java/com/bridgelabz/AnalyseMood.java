package com.bridgelabz;

import java.util.IllegalFormatCodePointException;

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
}
