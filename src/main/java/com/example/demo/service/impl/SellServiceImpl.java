package com.example.demo.service.impl;

import com.example.demo.entity.Sell;
import com.example.demo.mapper.SellMapper;
import com.example.demo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellServiceImpl implements SellService {

    @Autowired
    public SellMapper sellMapper;

    /**
     * 新增售出商品
     * @param sell
     * @return
     */
    @Override
    public String insertSell(Sell sell) {
        Integer counst = sellMapper.insertSell(sell);
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
}
