package com.bridgelabz;

public class AnalyseMood {
    public String happyOrSad(String message) {
        if(message.contains("Sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
