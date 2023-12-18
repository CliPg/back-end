package com.PeanutJava.Grammar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        /*1.创建集合的对象
        泛型：限定集合中的存储数据的类型
         */
        ArrayList<String> list=new ArrayList<>();

        //添加元素
        boolean result = list.add("666");//add返回true
        list.add("777");
        list.add("888");
        System.out.println(result);
        System.out.println(list);

        //删除元素
        list.remove("666");
        System.out.println(list);
        String str =list.remove(1);//索引：删除并返回被删除的值
        System.out.println(str);
        System.out.println(list);

        //修改元素
        list.set(0,"999");

        //查询元素
        String str3 =list.get(0);
        System.out.println(str3);

        //遍历
        /*for (int i = 0; i < list.size(); i++) {
            String str2=list.get(0);
            System.out.println(str2);
        }
        list.add("9999");
        list.add("9999");
        list.add("9999");

        int count = 0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)=="9999"){
                count++;
            }
        }
        System.out.println(count);


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        if(a=="666"){
            System.out.println(6);
        }*/
        list.remove(0);
        System.out.println(list.size());

        /*int num01=0;
            int num02=0;
            boolean flag1 = false;
            while (!flag1) {
                System.out.println("请问"+c.getName()+"需要几只中华田园犬呢？");
                Scanner s1 = new Scanner(System.in);
                int num1 = s1.nextInt();
                if (num1 > 0) {
                    ChineseRuralDog dog = new ChineseRuralDog(null, 0, null, false);
                    num01 = num1;
                    flag1 = Sell(dog, num1);
                } else if (num1 == 0) {
                    num01 = num1;
                    flag1 = true;

                }else{
                    System.out.println("请输入大于等于0的数字哦！");
                }
            }
            boolean flag2 = false;
            while (!flag2) {
                System.out.println("请问需要几只猫呢？");
                Scanner s2 = new Scanner(System.in);
                int num2 = s2.nextInt();
                if (num2 > 0) {
                    Cat cat = new Cat(null, 0, null);
                    num02 = num2;
                    flag2 = Sell(cat, num2);
                } else if (num2 == 0) {
                    System.out.println("谢谢惠顾！");
                    num02 = num2;
                    flag2 = true;
                } else {
                    System.out.println("请输入大于等于0的数字哦！");
                }
            }*/


    }
}
