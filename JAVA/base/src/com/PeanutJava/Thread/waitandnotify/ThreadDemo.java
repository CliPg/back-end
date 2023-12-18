package com.PeanutJava.Thread.waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        //生产者和消费者必须使用同一个阻塞队列

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);//(上限)
    }
}
