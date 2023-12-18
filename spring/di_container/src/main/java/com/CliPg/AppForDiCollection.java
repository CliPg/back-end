package com.CliPg;

import com.CliPg.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppForDiCollection {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件
        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\77507\\Desktop\\JAVA\\spring\\di_container\\src\\main\\java\\com\\CliPg\\AppForDiCollection.java");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();
    }
}
