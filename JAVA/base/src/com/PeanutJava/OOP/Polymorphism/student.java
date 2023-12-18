package com.PeanutJava.OOP.Polymorphism;

public class student extends person{
    public  void show(){
        System.out.println("学生的信息为:"+ getName()+","+getAge());
    }

}
