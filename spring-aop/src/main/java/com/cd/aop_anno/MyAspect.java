package com.cd.aop_anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Controller;

/**
 * @author cdviviany
 * @version 1.00
 */
@Controller("myAspect2")
@Aspect
public class MyAspect {
    //前置增强方法
    @Before("execution(* com.cd.aop_anno.*.*(..))")
    public void before(){
        System.out.println("先去洗手");
    }
    @AfterReturning("execution(* com.cd.aop_anno.*.*(..))")
    public void after(){
        System.out.println("擦干净嘴，睡觉");
    }
}
