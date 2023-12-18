package com.PeanutJava.OOP.Abstract;

public  class student extends person{
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("打搅");

    }

}
