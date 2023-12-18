package com.clipg.test;

import com.clipg.mapper.GoodsMapper;
import com.clipg.mapper.OrderMapper;
import com.clipg.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderUpdate {
    public static void main(String[] args) throws IOException, ParseException {
        //1.获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        //4.执行方法
        int orderId = 1;
        String goodsName = "PG1";
        int orderNum = 1;
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date orderTime = dateformat.parse("2023-10-12 20:30:30");
        int orderPrice = 2000;
        Order order = new Order();
        order.setOrderId(orderId);
        order.setGoodsName(goodsName);
        order.setOrderNum(orderNum);
        order.setOrderTime(orderTime);
        order.setOrderPrice(orderPrice);
        orderMapper.updateDynamic(order);
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
