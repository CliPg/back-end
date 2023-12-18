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
import java.util.List;

public class GoodsSelect {
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
        //查看所有
        //List<Goods> goods1 = goodsMapper.selectAll();
        //System.out.println(goods1);
        //价格升序
        //List<Goods> goods1 = goodsMapper.selectAllPriceASC();
        //System.out.println(goods1);
        //时间升序
        List<Goods> goods1 = goodsMapper.selectAllPriceASC();
        System.out.println(goods1);

        //查看指定
        //通过名字
        Goods goods2 = goodsMapper.selectByName("PG1");
        System.out.println(goods2);
        //通过id
        Goods goods3 = goodsMapper.selectById(1);
        System.out.println(goods3);

        //动态条件查询
        //String goodsName4 = "PG1";
        ////int goodsPrice4 = 2000;
        ////int goodsNum4 = 100;
        //goodsName4 = "%" + goodsName3 + "%";
        //Map map = new HashMap();
        //map.put("goodsName4",goodsName4);
        ////map.put("goodsPrice",goodsPrice);
        ////map.put("goodsNum4",goodsNum4);
        //List<Goods> goods4 = goodsMapper.selectByDynamicCondition(map);
        //System.out.println(goods4);

        //5.释放资源
        sqlSession.close();
    }
}
