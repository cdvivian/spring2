package com.cd.aop;

/**
 * @author cdviviany
 * @version 1.00
 */
public class Target implements TargetInterface {
    @Override
    public void eat() {
        System.out.println("吃饭中");
    }
}
