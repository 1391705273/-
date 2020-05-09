package com.example.demo.controller;

import com.example.demo.entity.Commodity;
import com.example.demo.entity.Sell;
import com.example.demo.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SellController {

    @Autowired
    public SellService sellService;

    /**
     *出售商品列表
     * @return
     */
    @GetMapping("/sell")
    public String sell(){
        return "sell";
    }

    /**
     * 新增售出商品
     * @param sell
     * @return
     */
    @PostMapping("/insertSell")
    @ResponseBody
    public String insertSell(Sell sell){
        return sellService.insertSell(sell);
    }

    /**
     * 删除售出商品信息
     * @param id
     * @return
     */
    @PostMapping("/delSell")
    @ResponseBody
    public String delSell(Integer id){
        return sellService.delSell(id);
    }

    /**
     * 更新售出商品数据
     * @param sell
     * @return
     */
    @PostMapping("/updateSell")
    @ResponseBody
    public String updateSell(Sell sell){
        return sellService.updateSell(sell);
    }

    /**
     * 查询售出商品列表
     * @param
     * @return
     */
    @GetMapping("/getSell")
    @ResponseBody
    public List<Sell> getSell() {
        return sellService.getSell();
    }
}
