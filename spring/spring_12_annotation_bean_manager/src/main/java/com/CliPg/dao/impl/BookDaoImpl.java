package com.CliPg.dao.impl;

import com.CliPg.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("book dao save");
    }
    @PostConstruct
    public void init(){
        System.out.println("book dao init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy");
    }



}
