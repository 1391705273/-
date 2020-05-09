package com.example.demo.service;

import com.example.demo.entity.Commodity;

import java.util.List;

public interface CommodityService {

    // 新增商品
    String insertCommodity (Commodity commodity);

    // 删除商品
    String delCommodity (Integer id);

    // 修改商品数据
    String updateCommodity(Commodity commodity);

    // 查询商品列表
    List<Commodity> getCommodity();

    // 根据商品id查询该商品数据
    List<Commodity> getCommodityById(Integer id);
}
