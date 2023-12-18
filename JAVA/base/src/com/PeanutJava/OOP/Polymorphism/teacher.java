package com.PeanutJava.OOP.Polymorphism;

public class teacher extends person {
    public  void show(){
        System.out.println("老师的信息为:"+ getName()+","+getAge());
    }
}
