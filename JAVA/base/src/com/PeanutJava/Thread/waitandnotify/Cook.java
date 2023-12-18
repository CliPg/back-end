package com.PeanutJava.Thread.waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                queue.put("面条");
                System.out.println("厨师做了一碗面");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
