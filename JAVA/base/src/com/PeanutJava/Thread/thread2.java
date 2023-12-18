package com.PeanutJava.Thread;

public class thread2 {
    public static void main(String[] args) {
        /*
        线程的第二种启动方式
        1.自己定义一个类实现runnable接口
        2.重写里面的run方法
        3.创建自己的类的对象
        4.创建一个Thread类的对象，并开启线程
         */

        //创建对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        //设置优先级，数字越大，优先级越高，越有可能先运行完
        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //开启线程
        t1.start();
        t2.start();
    }
}
