package com.stackroute.pg1;

public class tomJerry {
    private String str;
    public String checkFunction(int number){
        if((number%2==0)&&(number>=20 && number<=30 )){
            str = "jerry";
        }
        else if((number%2==1)&&(number>=20 && number<=30 )){
            str="tom";
        }
        else{
            str = "Neither Tom nor Jerry";
        }
        return str;


    }
}
