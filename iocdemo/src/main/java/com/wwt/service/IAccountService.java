package com.wwt.service;

import com.wwt.pojo.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    List<Account> findAllAccount();
    Account findAccountById(Integer accountId);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer accountId);

    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    void transfer(String sourceName,String targetName,Float money);

}
