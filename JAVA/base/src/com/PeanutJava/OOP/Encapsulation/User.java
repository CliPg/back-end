package com.PeanutJava.OOP.Encapsulation;

public class User {
    //属性
    private String uername;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User(){}
    //带全部参数的构造
    public User(String uername,String password,String email,String gender,int age){
        this.uername=uername;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }
    //get和set方法
    public void setUername(String uername){
        this.uername=uername;
    }
    public String getUername(){
        return uername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //快捷键
    //alt+insert
    //插件ptg 右键
    //标准的Javabean
    /*1.成员变量使用private修饰
    2.提供至少两个构造方法（无参和有参）
    3成员方法
    提供每个成员变量对应的set和get
     */

}
