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

public class GoodsDelete {
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
        //判断订单内是否存在该商品，若存在，则取消该订单
        int goodsId = 8;
        Goods goods1 = goodsMapper.selectById(goodsId);
        for (int j = 1; j <= 6; j++){
            Order order = orderMapper.selectByid(j);
            if (goods1.getGoodsName().equals(order.getGoodsName())){
                orderMapper.deleteById(j);
                sqlSession.commit();
                System.out.println(j + "号订单取消");
            }
        }
        goodsMapper.deleteById(goodsId);
        sqlSession.commit();

        //批量删除
        //判断订单内是否存在该商品，若存在，则取消该订单
        //int [] goodsIds = {0,0};
        //for (int i = 0; i < goodsIds.length; i++) {
        //    Goods goods2 = goodsMapper.selectById(goodsIds[i]);
        //    for (int j = 1; j <= 3; j++){
        //        Order order = orderMapper.selectByid(j);
        //        if (goods2.getGoodsName().equals(order.getGoodsName())){
        //            orderMapper.deleteById(j);
        //            sqlSession.commit();
        //            System.out.println(j + "号订单取消");
        //        }
        //    }
        //}
        //goodsMapper.deleteByIds(goodsIds);
        //sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
}
