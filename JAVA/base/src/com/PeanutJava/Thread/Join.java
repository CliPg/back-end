package com.PeanutJava.Thread;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setName("pg");
        t.start();
        //表示把t这个线程插入到当前线程之前
        //当前线程：main
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("888");
        }
    }
}
