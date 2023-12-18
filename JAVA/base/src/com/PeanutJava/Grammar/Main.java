package com.PeanutJava.Grammar;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float water =sc.nextInt();
        float money;
        if(water<=15){
            money=(float)(water*4/3);
        }else{
            money=(float)(water*2.5-17.5);
        }
        System.out.printf("%.2f",money);
    }
}