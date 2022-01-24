package com.cd.exceptionResolver;

import com.cd.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cdviviany
 * @version 1.00
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof MyException){
            modelAndView.addObject("name","自定义异常");
            modelAndView.setViewName("error.jsp");
        }
        return modelAndView;
    }
}
