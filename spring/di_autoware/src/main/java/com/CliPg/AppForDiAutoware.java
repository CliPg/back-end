package com.CliPg;

import com.CliPg.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiAutoware {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
