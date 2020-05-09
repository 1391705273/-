package com.example.demo.service;

import com.example.demo.entity.Sell;

import java.util.List;

public interface SellService {

    // 新增商品
    String insertSell (Sell sell);

    // 删除商品
    String delSell (Integer id);

    // 修改商品数据
    String updateSell(Sell sell);

    // 查询商品列表
    List<Sell> getSell();

    // 根据id查询售出商品的数据
    List<Sell> getSellById(Integer id);
}
