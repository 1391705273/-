package com.example.demo.mapper;

import com.example.demo.entity.Sell;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellMapper {

    // 新增商品
    Integer insertSell (Sell sell);

    // 删除商品
    Integer delSell (Integer id);

    // 修改商品数据
    Integer updateSell(Sell sell);

    // 查询商品列表
    List<Sell> getSell();

    // 根据id查询售出商品的数据
    List<Sell> getSellById(Integer id);
}
