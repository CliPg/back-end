package com.PeanutJava.OOP.Interface;

public class rabbit extends animal{
    public rabbit() {
    }

    public rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
