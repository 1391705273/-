package com.example.demo.mapper;

import com.example.demo.entity.Account;
import com.example.demo.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    // 注册用户名
    Integer insertAccount(Account account);

    // 删除账号
    Integer delAccount(Integer id);

    // 更新账户信息
    Integer updateAccount(Account account);

    // 查询有无账户
    Integer getAccount(String account,String password);

    // 查询此系统所有工作人员
    List<Account> getNumber(Account account);
}
