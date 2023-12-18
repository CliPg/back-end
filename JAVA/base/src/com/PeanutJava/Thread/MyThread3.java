package com.PeanutJava.Thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class MyThread3 extends Thread{

    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run(){
        while (true){
            try {
                lock.lock();
                if(ticket<100){
                    ticket++;
                    System.out.println(getName()+"第"+ticket+"张");
                }else {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }

        }
    }

}
