package com.clipg.dao;

import com.clipg.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {


    @Insert("insert into order_management.goods (goods_id,goods_name,goods_price,goods_num) values(#{id},#{name},#{price},#{num})")
    public void save(Goods goods);

    @Update("update order_management.goods set goods_id = #{id}, goods_name = #{name}, goods_price = #{price}, goods_num = #{num} where goods_id = #{id}")
    public void update(Goods goods);

    @Delete("delete from order_management.goods where goods_id = #{id}")
    public void delete(int id);
    
    @Select("select  * from order_management.goods where goods_id = #{id}")
    public Goods getById(int id);
    
    @Select("select * from order_management.goods")
    public List<Goods> getAll();

}
