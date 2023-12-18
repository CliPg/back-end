package com.PeanutJava.Thread;

public class test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("线程1:");
        t2.setName("线程2:");

        t1.start();
        t2.start();

    }
}
