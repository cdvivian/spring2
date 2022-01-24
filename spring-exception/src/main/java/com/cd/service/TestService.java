package com.cd.service;

import com.cd.exception.MyException;

/**
 * @author cdviviany
 * @version 1.00
 */
public class TestService {
    public void show(){
        throw new MyException("这是自定义的异常");
    }
}
