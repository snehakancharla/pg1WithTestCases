package com.stackroute.pg1;

public class GuessNumber {
    private int input;
    private String hold;
    public String NumberToGuess(int input){
        if (input >= 1 && input <= 50) {
           hold= "Number guessed matches the original number";
        } else if (input < 1) {
            hold="Number guessed is less than the original number";
        } else {
            hold="Number guessed is more than the original number";
        }
        return hold;

    }
}
