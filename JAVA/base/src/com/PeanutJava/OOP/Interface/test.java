package com.PeanutJava.OOP.Interface;

public class test {
    public static void main(String[] args) {
        frog f = new frog("小青",5);
        System.out.println(f.getName()+","+f.getAge());

        f.eat();
        f.swim();
        f.toString();
    }
}
