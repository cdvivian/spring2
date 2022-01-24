package com.cd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * @author cdviviany
 * @version 1.00
 */
@Controller
@RequestMapping(value = "/test",produces = "application/json;charset=utf8")
public class Test1 {
    @RequestMapping("/ljq")
    @ResponseBody
    public String test2(HttpServletResponse httpServletResponse){
        httpServletResponse.setCharacterEncoding("UTF-8");
        return "您已经通过拦截器成功登录";
    }
    @RequestMapping("/test1")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","harry");
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}
