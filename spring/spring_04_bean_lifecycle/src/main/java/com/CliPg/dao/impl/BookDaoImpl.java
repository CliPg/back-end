package com.CliPg.dao.impl;

import com.CliPg.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("book dao save");
    }
    public void init(){
        System.out.println("book dao init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
