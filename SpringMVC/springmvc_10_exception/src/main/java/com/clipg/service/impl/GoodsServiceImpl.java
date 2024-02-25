package com.clipg.service.impl;

import com.clipg.controller.Code;
import com.clipg.dao.GoodsDao;
import com.clipg.domain.Goods;
import com.clipg.exception.BusinessException;
import com.clipg.exception.SystemException;
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
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"重试");
        }

        //将可能出现的异常包装，转换成自定义异常
        try {
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试",e);
        }

        return goodsDao.getById(id);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }
}
