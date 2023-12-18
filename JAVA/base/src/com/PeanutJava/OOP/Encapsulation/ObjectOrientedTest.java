package com.PeanutJava.OOP.Encapsulation;

public class ObjectOrientedTest {
    public static void main(String[] args) {
        ObjectOriented p=new ObjectOriented();
        ObjectOriented q=new ObjectOriented("NIKE");
        p.brand="HUAWEI";
        p.price=666;
        System.out.println(p.brand);
        p.call();
        p.sum(1,2);
        String s="lhsnb";
        int len=s.length();
        System.out.println(len);
    }
}
