package com.wzq.controler.anno;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControlerAnno {
    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest req,HttpServletResponse res){
        ModelAndView mv=new ModelAndView("hello","msg", "hello world");
        mv.addObject("msg", "hello world");
        mv.addObject("comment", "this just a comment!!");
        mv.setViewName("hello");
        return mv;
    }
    
    @RequestMapping("/test")
    public String test(HttpServletRequest req,HttpServletResponse res){
        
        return "hello";
    }
}