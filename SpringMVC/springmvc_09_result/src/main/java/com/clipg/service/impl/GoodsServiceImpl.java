package com.clipg.service.impl;

import com.clipg.dao.GoodsDao;
import com.clipg.domain.Goods;
import com.clipg.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public boolean save(Goods goods) {
        goodsDao.save(goods);
        return true;
    }

    public boolean update(Goods goods) {
        goodsDao.update(goods);
        return true;
    }

    public boolean delete(int id) {
        goodsDao.delete(id);
        return true;
    }

    public Goods getById(int id) {
        return goodsDao.getById(id);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }
}
