package com.example.demo.entity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Sell {
    private Integer id;
    private String commodityName;
    private Integer amount;
    private BigDecimal sellPrice;
}
