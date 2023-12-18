package com.PeanutJava.Thread;


public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //书写线程要执行的代码
        for(int i=0;i<10;i++){
            System.out.println(getName()+"666");

            //礼让线程 会让线程交替更均匀一点
            //Thread.yield();
            }
        }
    }

