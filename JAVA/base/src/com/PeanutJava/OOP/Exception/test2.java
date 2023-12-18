package com.PeanutJava.OOP.Exception;

public class test2 {
    //可能会存在异常的方法
    public static void Test(int a) throws MyException {
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }

    public static void main(String[] args)  {
        try {
            Test(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
        }
    }
}
