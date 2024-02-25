package com.clipg.service;

import com.clipg.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GoodsService {

    /**
     * 保存
     * @param goods
     * @return
     */
    public boolean save(Goods goods);

    /**
     * 修改
     * @param goods
     * @return
     */
    public boolean update(Goods goods);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(int id);

    public Goods getById(int id);

    public List<Goods> getAll();
}
