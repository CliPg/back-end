package com.clipg.test;

import com.clipg.mapper.GoodsMapper;
import com.clipg.mapper.OrderMapper;
import com.clipg.pojo.Goods;
import com.clipg.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class OrderAdd {
    public static void main(String[] args) throws IOException {
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
        //创建订单
        int orderId = 6;
        String goodsName = "ZK5";
        int orderNum = 2;
        Date orderTime = new Date();
        int orderPrice = 6000;
        Order order = new Order();
        order.setOrderId(orderId);
        order.setGoodsName(goodsName);
        order.setOrderNum(orderNum);
        order.setOrderTime(orderTime);
        order.setOrderPrice(orderPrice);
        //检查订单
        Goods goods = goodsMapper.selectByName(goodsName);
        goods.setGoodsNum(goods.getGoodsNum()-orderNum);
        goodsMapper.updateDynamic(goods);
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
