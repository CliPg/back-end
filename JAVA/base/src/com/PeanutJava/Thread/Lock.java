package com.PeanutJava.Thread;

public class Lock {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        MyThread3 t3 = new MyThread3();

        t1.setName("xc1:");
        t2.setName("xc2:");
        t3.setName("xc3:");

        t1.start();
        t2.start();
        t3.start();
    }
}
