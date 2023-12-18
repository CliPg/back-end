package com.PeanutJava.OOP.Final;

public class test {
    public static void main(String[] args) {

    }
}

class Fu{
    public void show(){
        System.out.println("父类");
    }
}

class Zi extends Fu{
    @Override
    public void show(){
        System.out.println("子类");
    }
}
