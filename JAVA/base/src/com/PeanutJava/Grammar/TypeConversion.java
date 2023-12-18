package com.PeanutJava.Grammar;

public class TypeConversion {
    public static void main(String[] args) {
        //隐式转换（自动提升转换）  小——>大
        int a=2;
        double b=3;
        double c=a+b;
        System.out.println(c);
        byte d=10;
        byte e=20;
        int f=d+e;
        System.out.println(f);//byte,char,short 进行运算时，都会自动转化为int类型
        //强制转化 大->小
        int g=5;
        double h=6;
        int i=(int)(g+h);
        System.out.println(i);

    }
}
