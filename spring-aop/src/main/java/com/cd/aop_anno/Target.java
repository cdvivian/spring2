package com.cd.aop_anno;

import org.springframework.stereotype.Controller;

/**
 * @author cdviviany
 * @version 1.00
 */

@Controller("target2")
public class Target implements TargetInterface {
    @Override
    public void eat() {
        System.out.println("吃饭中");
    }
}
