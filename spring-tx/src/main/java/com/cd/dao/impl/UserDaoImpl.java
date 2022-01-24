package com.cd.dao.impl;

import com.cd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author cdviviany
 * @version 1.00
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void out(String name, int bal) {
        jdbcTemplate.update("update account set bal = bal - ? where `name` = ?",bal,name);
    }

    public void in(String name, int bal) {
        jdbcTemplate.update("update account set bal = bal + ? where `name` = ?",bal,name);
    }
}
