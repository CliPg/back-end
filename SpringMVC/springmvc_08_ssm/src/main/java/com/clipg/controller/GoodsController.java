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
    public boolean save(@RequestBody Goods goods) {
        return goodsService.save(goods);
    }

    @PutMapping
    public boolean update(@RequestBody Goods goods) {

        return goodsService.update(goods);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {

        return goodsService.delete(id);
    }

    @GetMapping("/{id}")
    public Goods getById(@PathVariable Integer id) {
        return goodsService.getById(id);
    }

    @GetMapping
    public List<Goods> getAll() {
        return goodsService.getAll();
    }
}
