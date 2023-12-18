package com.PeanutJava.Thread;

public class Daemon {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("线程1：");
        t2.setName("线程2：");

        //把t2设为守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
