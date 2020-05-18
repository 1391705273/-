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

    // 查询库存商品数据 根据售出商品名名称与库存商品名称
    Commodity getCommodityName(String name);

    // 根据商品id查询该商品数据
    List<Commodity> getCommodityById(Integer id);

    // 查询库存商品名称
    List<Commodity> getCommodityByName();

    // 根据商品id修改库存商品数量
    String updateCommodityAmount(Integer id,Integer amount);
}
