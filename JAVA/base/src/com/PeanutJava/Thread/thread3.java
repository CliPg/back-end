package com.PeanutJava.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class thread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        多线程的第三种实现方法
        特点：可以获取多线程的结果
        1.创建一个类
        2.重写call（有返回值）
        3.创建MyCallable的对象
        4.创建FutureTask的对象（作用多线程的运行结果）
        5.创建Thread类的对象，并启动
         */

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();
        Integer result = ft.get();
        System.out.println(result);
    }
}
