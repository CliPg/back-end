package com.clipg.service;


import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectSubqueryTableSource;
import com.clipg.config.SpringConfig;
import com.clipg.domain.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class GoodsServiceTest {

    @Autowired
    private GoodsService goodsService;

    @Test
    public void testGetById(){
        Goods goods = goodsService.getById(1);
        System.out.println(goods);
    }

    @Test
    public void testGetAll(){
        List<Goods> all  = goodsService.getAll();
        System.out.println(all);
    }
}
