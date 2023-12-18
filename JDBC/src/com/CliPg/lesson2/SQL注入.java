package com.CliPg.lesson2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL注入 {
    public static void main(String[] args) {
        //login("root","LHSqaz123");
        login("'or'1=1","'or'1=1");


    }

    public static void login(String username,String password){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            String sql = "select * from users where `name`='"+username+"' and `password` = '"+password+"'" ;

            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getObject("name"));
                System.out.println(rs.getObject("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,st,rs);
        }
    }

}
