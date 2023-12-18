package com.PeanutJava.OOP.Interface;

public class dog extends animal implements swim{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("小狗在狗刨");

    }
}
