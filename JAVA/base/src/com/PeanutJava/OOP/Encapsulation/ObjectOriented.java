package com.PeanutJava.OOP.Encapsulation;

public class ObjectOriented {
    //1.设计对象并使用
    /*public class 类名{
      1.成员变量
      2.成员方法
      3.构造器
      4.代码块
      5.内部类
     */
    String brand;
    double price;

    public ObjectOriented(){
        System.out.println("ANTA");
    }//构造方法（无参）
    public ObjectOriented (String brand){
        this.brand=brand;
    }//构造方法（有参）

    public void call() {
        System.out.println(6);
    }

    public void back() {
        System.out.println(66);
    }

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
