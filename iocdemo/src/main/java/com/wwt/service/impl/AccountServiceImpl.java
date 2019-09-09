package com.wwt.service.impl;

import com.wwt.dao.IAccountDao;
import com.wwt.pojo.Account;
import com.wwt.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.TransactionManager;

import java.util.List;

@Service(value = "defaultServive")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {

            List<Account> accounts = accountDao.findAllAccount();

            return accounts;

    }

    public Account findAccountById(Integer accountId) {
            Account account = accountDao.findAccountById(accountId);
            return account;
    }

    public void saveAccount(Account account) {

            accountDao.saveAccount(account);

    }

    public void updateAccount(Account account) {

            accountDao.updateAccount(account);

    }

    public void deleteAccount(Integer accountId) {
            accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
            Account source = accountDao.findAccountByName(sourceName);
            Account target = accountDao.findAccountByName(targetName);
            source.setMoney(source.getMoney() - money);
            target.setMoney(target.getMoney() + money);
            accountDao.updateAccount(source);
            accountDao.updateAccount(target);
    }
}
