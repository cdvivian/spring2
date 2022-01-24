package com.cd.aop;

/**
 * @author cdviviany
 * @version 1.00
 */
public class MyAspect {
    //前置增强方法
    public void before(){
        System.out.println("先去洗手");
    }
    public void after(){
        System.out.println("擦干净嘴，睡觉");
    }
}
