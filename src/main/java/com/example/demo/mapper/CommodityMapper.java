package com.example.demo.mapper;
import com.example.demo.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CommodityMapper {

    // 新增商品
    Integer insertCommodity (Commodity commodity);

    // 删除商品
    Integer delCommodity (Integer id);

    // 修改商品数据
    Integer updateCommodity(Commodity commodity);

    // 查询商品列表
    List<Commodity> getCommodity();

    // 根据商品id查询该商品数据
    List<Commodity> getCommodityById(Integer id);

    // 查询库存商品数据 根据售出商品名名称与库存商品名称
    Commodity getCommodityName(String name);

    // 查询库存商品名称
    List<Commodity> getCommodityByName();
}
