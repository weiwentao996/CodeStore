package com.wwt.dao.impl;

import com.wwt.dao.IAccountDao;
import com.wwt.pojo.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import utils.ConnectionUtils;

import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private QueryRunner runner;
    @Autowired
    private ConnectionUtils connectionUtils;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        System.out.println("***********" + connectionUtils);
        this.connectionUtils = connectionUtils;
        System.out.println("------------");
    }

    public List<Account> findAllAccount() {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            return runner.query(connectionUtils.getThreadConnection(), "select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account findAccountById(Integer accountId) {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            return runner.query(connectionUtils.getThreadConnection(), "select * from account where id = ?", new BeanHandler<Account>(Account.class), accountId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveAccount(Account account) {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            runner.update(connectionUtils.getThreadConnection(), "insert into account(name,money) value(?,?)", account.getName(), account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account) {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            runner.update(connectionUtils.getThreadConnection(), "update  account set name = ?,money = ? where id = ?", account.getName(), account.getMoney(), account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(Integer accountId) {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            runner.update(connectionUtils.getThreadConnection(), "delete from account where id = ?", accountId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account findAccountByName(String accountName) {
        try {
            System.out.println(connectionUtils.getThreadConnection());
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(), "select * from account where name =  ?", new BeanListHandler<Account>(Account.class), accountName);
            if (accounts == null || accounts.size() == 0) {
                return null;
            }
            if (accounts.size() > 1) {
                throw new RuntimeException("结果集不唯一，数据存在问题");
            }
            return accounts.get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
