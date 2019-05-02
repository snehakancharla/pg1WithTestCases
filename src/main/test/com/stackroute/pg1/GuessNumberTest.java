package com.stackroute.pg1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber gn=new GuessNumber();
    String str;

    @Test
    public void CheckGuess() throws Exception
     {
         //Act
         str=gn.NumberToGuess(45);
         //Assert
         assertEquals("Number guessed matches the original number",str);

         //Act
         str=gn.NumberToGuess(-7);
         //Assert
         assertEquals("Number guessed is less than the original number",str);


         //Act
         str=gn.NumberToGuess(77);
         //Assert
         assertEquals("Number guessed is more than the original number",str);




     }
}