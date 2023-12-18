package com.PeanutJava.Grammar;

public class array {
    public static void main(String[] args) {
        //静态初始化
        int [] array={0,1,2,3};
        for(int i=0;i<4;i++){
            System.out.println(array[i]);
        }
        String [] name={"刘华胜","lyy" };
        for(int j=0;j<2;j++){
            System.out.println(name[j]);
        }
        //动态初始化
        int []array2=new  int[3];//3为数组长度
        array2[0]=1;
        System.out.println(array2[0]);
        //二维数组
        int [][]array3={{1,2},{3,4}};
        for(int k=0;k<2;k++){
            for(int l=0;l<2;l++){
                System.out.println(array3[k][l]);
            }
        }
    }
}
