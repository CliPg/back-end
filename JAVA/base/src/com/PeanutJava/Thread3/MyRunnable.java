package com.PeanutJava.Thread3;

import com.PeanutJava.Thread.MyThread;
import sun.security.krb5.internal.Ticket;

//同步方法
public class MyRunnable implements Runnable{
    int ticket = 0;

    @Override
    public void run() {
        /*1.循环
        2.同步代码块（同步方法）
        3.判断共享数据是否到了末尾，如果到了末尾
        4.判断共享数据是否到了末尾，如果没到了末尾
         */

        while (true){

                if(method()) break;

        }
    }
    private synchronized boolean method(){
        if(ticket ==100){
            return true;
        }else {
            ticket++;
            System.out.println(Thread.currentThread().getName()+"第"+ticket+"张");

        }
        return false;
    }
}


