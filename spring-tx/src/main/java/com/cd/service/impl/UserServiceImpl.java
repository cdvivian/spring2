package com.cd.service.impl;

import com.cd.dao.UserDao;
import com.cd.dao.impl.UserDaoImpl;
import com.cd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cdviviany
 * @version 1.00
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;
    public void transfer(String namein,String nameout, int bal) {
        userDao.out(nameout,bal);
        //int i = 1 / 0;
        userDao.in(namein,bal);
    }
}
