package com.PeanutJava.Thread2;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 =new MyThread("线程1：");
        MyThread t2 =new MyThread("线程2：");

        t1.start();
        t2.start();

    }
}
