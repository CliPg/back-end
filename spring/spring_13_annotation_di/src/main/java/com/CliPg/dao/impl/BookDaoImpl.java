package com.CliPg.dao.impl;

import com.CliPg.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;

    public void save(){
        System.out.println("book dao save ..." + name);
    }
}
