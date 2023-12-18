package com.PeanutJava.OOP.Polymorphism;

public class test {
    public static void main(String[] args) {
        student s = new student();
        s.setName("张三");
        s.setAge(35);

        teacher t= new teacher();
        t.setName("李四");
        t.setAge(35);

        administractor a = new administractor();
        a.setName("王五");
        a.setAge(35);

        register(s);
        register(t);
        register(a);


    }

    public static void register(person p){
        p.show();
    }
}
