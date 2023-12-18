package com.PeanutJava.Thread.Wait;

public class Foodie extends Thread {
    @Override
    public void run() {
        /*
        1.循环
        2.同步代码块
        3.判断共享数据是否到末尾(到了）
        4.判断共享数据是否到末尾（没到）
         */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //先判断桌子是否有面条
                    if (Desk.foodFlag == 0) {
                        //如果没有 等待
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                    }else{
                        //把吃的总数-1
                        Desk.count--;
                        //有 开吃
                        System.out.println("还能吃"+ Desk.count+"碗");
                        //吃完 唤醒
                        Desk.lock.notify();
                        //修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }

        }
    }
}