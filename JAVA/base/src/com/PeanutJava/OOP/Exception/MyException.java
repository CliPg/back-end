package com.PeanutJava.OOP.Exception;
//自定义异常类
public class MyException extends Exception{

    //传递数字>10
    private int deatail;

    public MyException(int a){
        this.deatail = a;
    }

    //异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "deatail=" + deatail +
                '}';
    }
}
