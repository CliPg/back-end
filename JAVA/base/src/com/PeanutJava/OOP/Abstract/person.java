package com.PeanutJava.OOP.Abstract;

public abstract class person {

    private String name;
    private int age;

    public person(){

    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public void sleep(){
        System.out.println("睡觉");
    }
}
