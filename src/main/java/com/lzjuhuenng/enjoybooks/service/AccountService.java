package com.lzjuhuenng.enjoybooks.service;

import com.lzjuhuenng.enjoybooks.pojo.Account;
import java.util.List;

/**
 * Created by Administrator on 2017/4/4.
 */
public interface AccountService {

    public Account findByAccount(String account);

    public int insert(Account account);

    public boolean createAccount(Account account);

    public List<Account> findAll();

    public int delete(String id);

    public Account findById(String id);

    public int update(Account account);

}
