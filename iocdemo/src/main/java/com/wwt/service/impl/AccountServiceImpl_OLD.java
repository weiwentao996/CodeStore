//package com.wwt.service.impl;
//
//import com.wwt.dao.IAccountDao;
//import com.wwt.pojo.Account;
//import com.wwt.service.IAccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import utils.TransactionManager;
//
//import java.util.List;
//
//@Service(value = "sev")
//public class AccountServiceImpl_OLD implements IAccountService {
//    @Autowired
//    private IAccountDao accountDao;
//    @Autowired
//    private TransactionManager txManager;
//
//    public void setTxManager(TransactionManager txManager) {
//        this.txManager = txManager;
//    }
//
//    public void setAccountDao(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }
//
//    public List<Account> findAllAccount() {
//        try {
//            txManager.beginTransaction();
//            List<Account> accounts = accountDao.findAllAccount();
//            txManager.commit();
//            return accounts;
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//        return null;
//    }
//
//    public Account findAccountById(Integer accountId) {
//        try {
//            txManager.beginTransaction();
//            Account account = accountDao.findAccountById(accountId);
//            txManager.commit();
//            return account;
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//        return null;
//    }
//
//    public void saveAccount(Account account) {
//        try {
//            txManager.beginTransaction();
//            accountDao.saveAccount(account);
//            txManager.commit();
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//
//
//    }
//
//    public void updateAccount(Account account) {
//        try {
//            txManager.beginTransaction();
//            accountDao.updateAccount(account);
//            txManager.commit();
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//
//
//    }
//
//    public void deleteAccount(Integer accountId) {
//        try {
//            txManager.beginTransaction();
//            accountDao.deleteAccount(accountId);
//            txManager.commit();
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//
//    }
//
//    public void transfer(String sourceName, String targetName, Float money) {
//
//        try {
//            txManager.beginTransaction();
//            Account source = accountDao.findAccountByName(sourceName);
//            Account target = accountDao.findAccountByName(targetName);
//            source.setMoney(source.getMoney() - money);
//            int i = 10/0;
//            target.setMoney(target.getMoney() + money);
//            accountDao.updateAccount(source);
//            accountDao.updateAccount(target);
//            txManager.commit();
//        } catch (Exception e) {
//            txManager.rollback();
//            e.printStackTrace();
//        } finally {
//            txManager.release();
//        }
//
//    }
//}
