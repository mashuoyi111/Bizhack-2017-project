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
    private boolean unAnswer=false;

    @RequestMapping(value="/add.do",method = RequestMethod.GET)
    public ModelAndView welcome(){
            String message="new request added!";
            ModelAndView mv=new ModelAndView("hello","message",message);
            aRequest=true;
            unAnswer=true;
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

    @RequestMapping(value="/getans.do",method = RequestMethod.GET)
    public ModelAndView getans(){
        ModelAndView mv;
        if(unAnswer){
            mv=new ModelAndView("hello","message","We have noticed the blue shirts, please wait");
        }else {
            mv = new ModelAndView("hello", "message", "Hey! Blue shirt NO.14 is coming to you!");
        }
        unAnswer=false;
        return mv;
    }

    @RequestMapping(value="/responseans.do",method = RequestMethod.GET)
    public ModelAndView responans(){
        String message="You will go to A5 area";
        ModelAndView mv=new ModelAndView("hello","message",message);
        unAnswer=false;
        return mv;
    }

}