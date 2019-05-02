package com.stackroute.pg1;

public class StringMuli {
    private String str;
    String Output;
    public static String stringAdd(String str,int value){
        String new_word;
        int  i, len;
        new_word=str;
        len=str.length();
        for(i=0 ; i<value ;i++){
            new_word= new_word+ str.substring(len - value,len);
        }
        return new_word;
    }
}
