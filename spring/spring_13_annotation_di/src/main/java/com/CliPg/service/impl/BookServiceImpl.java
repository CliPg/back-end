package com.CliPg.service.impl;

import com.CliPg.dao.BookDao;
import com.CliPg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.bind.PrintConversionEvent;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

}
