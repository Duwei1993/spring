package com.springinaction.web.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/11 22:06
 **/

@Controller
@RequestMapping({"/","homepage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
