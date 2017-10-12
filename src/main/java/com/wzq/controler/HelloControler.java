package com.wzq.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloControler implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","hello springmvc");
        System.out.println("111");
        mv.setViewName("hello");
        return mv;
    }
    
}