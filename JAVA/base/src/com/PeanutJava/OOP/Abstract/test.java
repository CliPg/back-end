package com.PeanutJava.OOP.Abstract;

public class test {
    public static void main(String[] args) {
        student s = new student("张三",23);
        System.out.println(s.getName()+","+s.getAge());
        s.work();
    }
}
