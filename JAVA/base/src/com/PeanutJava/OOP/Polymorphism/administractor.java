package com.PeanutJava.OOP.Polymorphism;

public class administractor extends person{
    public  void show(){
        System.out.println("管理员的信息为:"+ getName()+","+getAge());
    }
}
