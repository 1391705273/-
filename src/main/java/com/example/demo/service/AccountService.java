package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Commodity;

import java.util.List;

public interface AccountService {

    // 注册用户名
    String insertAccount(Account account);

    // 删除账号
    String delAccount(Integer id);

    // 更新账户信息
    String updateAccount(Account account);

    // 查询有无账户
    String getAccount(String account,String password);

    // 查询此系统所有工作人员
    List<Account> getNumber(Account account);
}
