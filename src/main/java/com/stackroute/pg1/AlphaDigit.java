package com.stackroute.pg1;

public class AlphaDigit {
    private char ch;
     static String output;
    public static String Check(char ch){
        if(Character.isUpperCase(ch))        {
           output= " is uppercase alphabet.";
        }
        else if(Character.isLowerCase(ch))
        {
            output=ch +" is lowercase alphabet.";
        }
        else if(ch >= '0' && ch <= '9'){
            output=(ch+" is a digit");
        }
        else{
            output="special symbol";
        }

        return output;
    }
}
