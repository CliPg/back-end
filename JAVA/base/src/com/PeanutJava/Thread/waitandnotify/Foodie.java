package com.PeanutJava.Thread.waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
