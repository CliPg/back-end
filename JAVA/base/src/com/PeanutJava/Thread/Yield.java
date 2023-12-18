package com.PeanutJava.Thread;

public class Yield {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");
        //开始线程
        t1.start();
        t2.start();
    }
}
