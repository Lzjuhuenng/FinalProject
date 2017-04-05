package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.Account;


public interface AccountDao {

    int deleteAccountByID(Integer id);

    int insertAccount(Account record);

    int insertSelective(Account record);

    Account selectAccountByID(Integer id);

    Account selectAccountByAccount(String account);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}