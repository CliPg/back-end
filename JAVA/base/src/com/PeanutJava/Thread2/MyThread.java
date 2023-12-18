package com.PeanutJava.Thread2;

public class MyThread extends Thread{

    public MyThread(){
    }

    public MyThread(String name){
        super(name);
    }

    //表示这个类的所有对象，共享这个ticket数据 否则可能会出现打印相同数据的现象
    static int ticket = 0;

    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {//括号里装锁对象 锁对象任意 但一定是要唯一的
                //字节码文件对象一定是唯一的
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "这是第" + ticket + "张");
                } else {
                    break;
                }
            }
        }
    }
}

