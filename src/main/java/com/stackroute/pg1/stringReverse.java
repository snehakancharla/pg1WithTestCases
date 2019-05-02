package com.stackroute.pg1;

public class stringReverse {
    private String str;
    String Output;
    public static String reverseString(String str){
        char c[]=str.toCharArray();
        int i=0,j=c.length-1;
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);


    }
}
