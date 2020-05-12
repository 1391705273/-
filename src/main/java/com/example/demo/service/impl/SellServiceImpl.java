package com.example.demo.service.impl;

import com.example.demo.entity.Commodity;
import com.example.demo.entity.Sell;
import com.example.demo.mapper.SellMapper;
import com.example.demo.service.CommodityService;
import com.example.demo.service.SellService;
import org.apache.catalina.valves.rewrite.Substitution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellServiceImpl implements SellService {

    @Autowired
    private SellMapper sellMapper;
    @Autowired
    private CommodityService commodityService;

    /**
     * 新增售出商品
     * @param sell
     * @return
     */
    @Override
    public String insertSell(Sell sell) {
        Integer counst = sellMapper.insertSell(sell);
        Commodity commodity = commodityService.getCommodityName(sell.getCommodityName());
        commodity.setAmount(commodity.getAmount() - sell.getAmount());
        commodity.setPrice(commodity.getPrice().subtract(sell.getSellPrice()));
        commodityService.updateCommodity(commodity);
        if (counst > 0 ){
            return "已成功售出商品!";
        }
        return "售出商品失败,是否库存不足。";
    }

    /**
     * 删除售出商品
     * @param id
     * @return
     */
    @Override
    public String delSell(Integer id) {
        Integer counst = sellMapper.delSell(id);
        if (counst > 0 ){
            return "已删除售出商品!";
        }
        return "删除售出商品失败。";
    }

    /**
     * 更新售出商品数据
     * @param sell
     * @return
     */
    @Override
    public String updateSell(Sell sell) {
        Integer counst = sellMapper.updateSell(sell);
        if (counst > 0 ){
            return "已成功更新售出商品数据!";
        }
        return "更新售出商品数据失败。";
    }

    /**
     * 查询售出商品日志
     * @return
     */
    @Override
    public List<Sell> getSell() {
        return sellMapper.getSell();
    }

    /**
     * 根据id查询售出商品的数据
     * @param id
     * @return
     */
    @Override
    public List<Sell> getSellById(Integer id) {
        return sellMapper.getSellById(id);
    }
}
