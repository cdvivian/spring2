package com.cd.controller;

import com.cd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cdviviany
 * @version 1.00
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public void test1(){
        testService.show();
    }
}
