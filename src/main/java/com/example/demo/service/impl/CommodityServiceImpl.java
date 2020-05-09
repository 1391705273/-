package com.example.demo.service.impl;

import com.example.demo.entity.Commodity;
import com.example.demo.mapper.CommodityMapper;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    public CommodityMapper commodityMapper;

    /**
     * 新增商品
     * @param commodity
     * @return
     */
    @Override
    public String insertCommodity(Commodity commodity) {
        Integer count = commodityMapper.insertCommodity(commodity);
        if (count>0){
            return "新增成功！";
        }
        return "新增失败！！";
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @Override
    public String delCommodity(Integer id) {
        Integer count = commodityMapper.delCommodity(id);
        if (count > 0) {
            return "商品已下架！";
        }
        return "商品下架失败!!";
    }

    /**
     * 修改商品
     * @param commodity
     * @return
     */
    @Override
    public String updateCommodity(Commodity commodity) {
        Integer count = commodityMapper.updateCommodity(commodity);
        if (count > 0){
            return "商品更新数据成功！";
        }
        return "商品更新数据失败！！";
    }

    /**
     * 查询商品列表
     * @param
     * @return
     */
    @Override
    public List<Commodity> getCommodity() {
        return commodityMapper.getCommodity();
    }

    /**
     * 根据商品id查询该商品数据
     * @param id
     * @return
     */
    @Override
    public List<Commodity> getCommodityById(Integer id) {
        return commodityMapper.getCommodityById(id);
    }
}
