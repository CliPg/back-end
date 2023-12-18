package com.CliPg.lesson2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//增删改相同
public class TestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "INSERT INTO users(id,`name`,`password`,`email`,`birthday`)\n" +
                    "VALUES (5,'CliPg13','123456','984146262@qq.com','2015-8-7')";

            int i = st.executeUpdate(sql);
            if (i > 0) {
                System.out.println("插入成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }
    }
}
