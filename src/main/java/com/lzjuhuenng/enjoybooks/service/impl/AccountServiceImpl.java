package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.AccountDao;
import com.lzjuhuenng.enjoybooks.pojo.Account;
import com.lzjuhuenng.enjoybooks.service.AccountService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/4/4.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    public Account findById(String id) {
        return accountDao.selectAccountByID(new Integer(id));
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account findByAccount(String account) {
        System.out.println(account);
        System.out.println(accountDao.selectAccountByAccount(account));
        return accountDao.selectAccountByAccount(account);
    }

    public boolean createAccount(Account account) {
        return false;
    }

    public int delete(String id) {
        return 0;
    }

    public int insert(Account account) {
        return accountDao.insertAccount(account);
    }

    public int update(Account account) {
        return 0;
    }

    public List<Account> findAll() {
        return null;
    }


    public boolean isEmailExist(String email) {

        return accountDao.selectAccountByEmail(email) != null;
    }

    public boolean isAccountExist(String account) {
        return accountDao.selectAccountByAccount(account)!= null;
    }
}
