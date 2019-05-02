package com.stackroute.pg1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome pd=new Palindrome();
    String str;

    @Test
    public void CheckPalindrome() throws Exception
    {
        //Act
        str=pd.FindPalindrome(88888);
        //Assert
        assertEquals("is palindrome and the sum of even numbers is greater than 25",str);

        //Act
        str=pd.FindPalindrome(22222);
        //Assert
        assertEquals("is  a palindrome and the sum of even number is less than 25",str);

        str=pd.FindPalindrome(2124);
        //Assert
        assertEquals(" is not a palindrome",str);

    }
}