package com.clipg.controller;

import com.clipg.dao.GoodsDao;
import com.clipg.domain.Goods;
import com.clipg.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goodss")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping
    public Result save(@RequestBody Goods goods) {
        boolean flag = goodsService.save(goods);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Goods goods) {
        boolean flag = goodsService.update(goods);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = goodsService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Goods goods = goodsService.getById(id);
        Integer code = goods != null ? Code.GET_OK:Code.GET_ERR;
        String msg = goods != null ? "":"数据查询失败";
        return new Result(code,goods,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Goods> all = goodsService.getAll();
        Integer code = all != null ? Code.GET_OK:Code.GET_ERR;
        String msg = all != null ? "":"数据查询失败";
        return new Result(code,all,msg);
    }
}
