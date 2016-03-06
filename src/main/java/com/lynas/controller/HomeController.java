package com.lynas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LynAs on 20-Jan-16
 */
@Controller
public class HomeController {

    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
