package com.PeanutJava.Thread.Wait;



public class Cook extends Thread{
    @Override
    public void run() {
        /*
        1.循环
        2.同步代码块
        3.判断共享数据是否到末尾(到了）
        4.判断共享数据是否到末尾（没到）
         */

        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else {
                    //判断桌子是否有食物
                    if(Desk.foodFlag ==1){
                        //如果有，等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //如果没有 制作
                        System.out.println("厨师在做了");
                        //修改桌子食物状态
                        Desk.foodFlag = 1;
                        //唤醒消费者开吃
                        Desk.lock.notifyAll();
                    }




                }
            }
        }

    }
}
