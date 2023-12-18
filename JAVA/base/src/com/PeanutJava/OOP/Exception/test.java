package com.PeanutJava.OOP.Exception;

import java.util.concurrent.Callable;

public class test {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        try{//try监控区域
            if(b==0){//主动抛出异常,一般在方法中使用
                throw new ArithmeticException();
            }
            System.out.println(a / b);
        }catch (ArithmeticException c){//catch(想要捕获的异常类型 Throwable>Exception>Error)
            System.out.println("程序异常");
        }finally {//处理善后工作
            System.out.println("finally");
        }
    }
}
