package com.PeanutJava.Thread;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
    /*
        String getName();                 返回线程的名称
        void setName(String name);        设置线程的名字（构造方法也可以设置名字）
        细节:
        1.如果没有设置名字，系统默认命名
        Thread-0……
        2.如果我们要给线程设置名字，可以用get或构造方法（但是需要MyThread自己写）
        static Thread currentThread();    获取当前线程的对象
        细节：
        当jvm虚拟机启动之后，会自动启动多条线程
        其中一条线程叫做main线程
        他的作用就是调用main方法，执行里面的代码
        static void sleep(long time);     让线程休眠指定的时间，单位为毫秒
        细节：
        1.哪条线程执行到这个方法，那么哪条线程就会在这里执行相应的时间
        2.参数单位为ms
     */
        //1.创建线程的对象
        MyThread t1 = new MyThread("线程1：");
        MyThread t2 = new MyThread("线程2：");

        //t1.setName();
        //2.开启线程
        t1.start();
        t2.start();

        //sleep
        //System.out.println("pg13");
        //Thread.sleep(5000);
        //System.out.println("MVPG");


    }
}
