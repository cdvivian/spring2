package com.cd.tes;

import com.cd.aop_anno.Target;
import com.cd.aop_anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cdviviany
 * @version 1.00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AOP_annoTest {
    @Autowired
    private TargetInterface target;
    @Test
    public void test1(){
        target.eat();
    }
}
