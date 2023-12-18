package com.CliPg.service.impl;

import com.CliPg.dao.BookDao;
import com.CliPg.service.BookService;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {
    public void save(){
        System.out.println("book service save");
    }


}
