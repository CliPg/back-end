package com.clipg.controller;

import com.clipg.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    //普通参数传递
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name){
        System.out.println("普通参数传递 name:" + name);
        return "{'module':'common param'}";
    }

    //普通参数：请求参数名与形参名不同
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username){
        System.out.println("普通参数传递 name:" + username);
        return "{'module':'common param'}";
    }

    //POJO参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递：" + user);
        return  "{'module':'pojo param'}";
    }

    //嵌套POJO参数
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo嵌套pojo参数传递：" + user);
        return  "{'module':'pojo contain pojo param'}";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递：" + Arrays.toString(likes));
        return  "{'module':'array param'}";
    }

    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递：" + likes);
        return  "{'module':'list param'}";
    }

    //集合参数:json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递：" + likes);
        return  "{'module':'list common for json param'}";
    }

    //POJO参数:json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json)参数传递：" + user);
        return  "{'module':'pojo for json param'}";
    }

    //集合pojo参数:json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("pojo(json)参数传递：" + list);
        return  "{'module':'list pojo for json param'}";
    }
}
