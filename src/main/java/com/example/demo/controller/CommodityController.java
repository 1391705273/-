package com.example.demo.controller;

import com.example.demo.entity.Commodity;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CommodityController {

    @Autowired
    public CommodityService commodityService;

    /**
     * 商品修改页面
     * @return
     */
    @GetMapping("/editCommodity")
    public String editCommodity(){
        return "editCommodity";
    }

    /**
     * 新增商品
     * @param commodity
     * @return
     */
    @PostMapping("/insertCommodity")
    @ResponseBody
    public String insertCommodity(Commodity commodity){
        return commodityService.insertCommodity(commodity);
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @PostMapping("/delCommodity")
    @ResponseBody
    public String delCommodity(Integer id){
        return commodityService.delCommodity(id);
    }

    /**
     * 更新商品数据
     * @param commodity
     * @return
     */
    @PostMapping("/updateCommodity")
    @ResponseBody
    public String updateCommodity(Commodity commodity){
        return commodityService.updateCommodity(commodity);
    }

    /**
     * 查询商品列表
     * @param
     * @return
     */
    @GetMapping("/getCommodity")
    @ResponseBody
    public List<Commodity> getCommodity() {
        return commodityService.getCommodity();
    }

    /**
     * 根据商品id查询该商品数据
     * @param id
     * @return
     */
    @GetMapping("/getCommodityById")
    @ResponseBody
    public List<Commodity> getCommodityById(Integer id){
        return commodityService.getCommodityById(id);
    }
}
