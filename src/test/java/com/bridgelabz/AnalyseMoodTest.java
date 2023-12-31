package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnalyseMoodTest {
    AnalyseMood mood = new AnalyseMood();
    @Test
    public void checkMessageAndReturnMoodHappy(){
        String res = mood.happyOrSad("Happy");
        Assertions.assertEquals("HAPPY",res);
    }
    @Test
    public void checkMessageAndReturnMoodSad(){
        String res = mood.happyOrSad("Sad");
        Assertions.assertEquals("SAD",res);
    }
    @Test
    public void checkMessageAndReturnMoodHappyUsingConstructor(){
        AnalyseMood analyseMood = new AnalyseMood("I am in Sad mood");
        String res = analyseMood.happyOrSadUsingConstructor();
        Assertions.assertEquals("SAD",res);
    }
    @Test
    public void messageContainsHappyShouldReturnSad(){
        AnalyseMood analyseMood = new AnalyseMood("I am in happy mood");
        String res = analyseMood.containsHappyGiveSad();
        Assertions.assertEquals("SAD",res);
    }
    @Test
    public void enteredNullInputShouldReturnHappy(){
        AnalyseMood analyseMood = new AnalyseMood(null);
        String res = analyseMood.containsNullGiveHappy();
        Assertions.assertEquals("HAPPY",res);
    }
    @Test
    public void userEnteredNullOrEmptyMoodDisplayMoodAnalysisException() {
        AnalyseMood analyseMood = new AnalyseMood(" ");
        try {
            String result = analyseMood.containsNullGiveMoodAnalysisException();
            Assertions.assertEquals("HAPPY", result);
        } catch (MoodAnalyserException ex) {
            // Handle the exception if needed
            System.out.println("MoodAnalyserException: " + ex.getMessage());
        }
    }
}
