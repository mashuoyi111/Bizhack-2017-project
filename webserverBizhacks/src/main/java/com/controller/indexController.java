package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/2/16.
 */

@Controller
public class indexController {
    private boolean aRequest=false;

    @RequestMapping(value="/add.do",method = RequestMethod.GET)
    public ModelAndView welcome(){
            String message="new request added!";
            ModelAndView mv=new ModelAndView("hello","message",message);
            aRequest=true;
            return mv;

    }

    @RequestMapping(value="/get.do",method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView mv;
        if(aRequest){
            mv=new ModelAndView("hello","message","There is a customer request from A5 area!");
        }else {
            mv = new ModelAndView("hello", "message", "no request right now");
        }
        aRequest=false;
        return mv;
    }

}