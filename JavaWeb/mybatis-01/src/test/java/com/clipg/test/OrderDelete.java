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

public class OrderDelete {
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
        //删除指定
        int orderId = 0;
        orderMapper.deleteById(orderId);
        Order order = orderMapper.selectByid(orderId);
        Goods goods = goodsMapper.selectByName(order.getGoodsName());
        //相应的库存增加
        goods.setGoodsNum(goods.getGoodsNum()+order.getOrderNum());
        goodsMapper.updateDynamic(goods);
        sqlSession.commit();

        //批量删除
        //int [] orderIds = {0,0};
        //orderMapper.deleteByIds(orderIds);
        //sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
