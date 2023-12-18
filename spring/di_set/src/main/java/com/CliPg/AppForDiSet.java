package com.CliPg;

import com.CliPg.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiSet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //ctx.close();比较暴力
    }
}
