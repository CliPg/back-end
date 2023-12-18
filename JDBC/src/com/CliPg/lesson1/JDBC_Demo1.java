package com.CliPg.lesson1;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBC_Demo1 {
    public static void main(String[] args) {
        //1.加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //2.用户信息和url
            String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
            String username = "root";
            String password = "LHSqaz123";

        //3.连接成功，数据库对象


        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            //connection:数据库


        //4.执行SQL的对象
        Statement statement = connection.createStatement();


        //5.执行SQL的对象 去 执行SQL
            String sql = "SELECT * FROM users";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getObject("id"));
                System.out.println("name=" + resultSet.getObject("name"));
                System.out.println("password=" + resultSet.getObject("password"));
                System.out.println("birthday=" + resultSet.getObject("birthday"));
            }

            //6.释放连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
