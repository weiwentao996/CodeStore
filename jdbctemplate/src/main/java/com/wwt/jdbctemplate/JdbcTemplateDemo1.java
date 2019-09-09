package com.wwt.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *JdbcTempLate的最基本用法
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate jt = new JdbcTemplate();
        jt.execute("insert into account(name,money) values('eee','1000')");
    }
}
