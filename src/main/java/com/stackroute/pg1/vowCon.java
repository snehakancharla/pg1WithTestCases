package com.stackroute.pg1;

public class vowCon {

    private String str;
    private String stOutCome="";

    public String FindVowCon(String str){

        int i;
        String finalString="";

        for (i = 0; i <str.length(); i++)
        {
            char ch=str.charAt(i);
            if((ch>='a')||(ch<='z')||(ch>='A')||(ch<='Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    stOutCome = ch + "-vowel\n";
                } else {
                    stOutCome = ch + "-Consonants\n";
                }
            }

            finalString = finalString + stOutCome;

        }
        return finalString;
    }
}
