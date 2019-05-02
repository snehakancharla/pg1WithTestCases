package com.stackroute.pg1;

public class Palindrome {
    private int number;
    String hold;
    public String FindPalindrome(int number){

        long r, sum = 0, temp, add = 0;
        temp=number;
        while (number>0)
        {

            r=number%10;
            sum = (sum * 10) + r;
            number = number/10;

            if(r%2==0)
                add = add+r;


        }

        if( (temp == sum) && (add>25) )
            hold= "is palindrome and the sum of even numbers is greater than 25";

        else if ((temp == sum) && (add<25))
        {
            hold="is  a palindrome and the sum of even number is less than 25";
        }
        else
        {
            hold=" is not a palindrome";
        }

        return hold;
    }
}

