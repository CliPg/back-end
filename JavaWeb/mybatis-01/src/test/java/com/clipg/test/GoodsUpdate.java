package com.clipg.test;

import com.clipg.mapper.GoodsMapper;
import com.clipg.mapper.OrderMapper;
import com.clipg.pojo.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GoodsUpdate {
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
        String goodsName = "PG6";
        int goodsPrice = 2500;
        int goodsNum = 100;
        int goodsId = 6;
        Goods goods = new Goods();
        goods.setGoodsName(goodsName);
        goods.setGoodsPrice(goodsPrice);
        goods.setGoodsNum(goodsNum);
        goods.setGoodsId(goodsId);
        goodsMapper.updateDynamic(goods);
        sqlSession.commit();

        //5.释放资源
        sqlSession.close();
    }
}
