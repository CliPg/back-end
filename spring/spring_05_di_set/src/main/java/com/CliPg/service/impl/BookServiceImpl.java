package com.CliPg.service.impl;

import com.CliPg.dao.BookDao;
import com.CliPg.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new方式创建的对象
    private BookDao bookDao;

    //实例化bean-构造方法
    //public BookServiceImpl() {
    //    System.out.println(6);
    //}

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

}
