package com.springinaction.web.spittr.controller;

import com.springinaction.web.spittr.component.Spitter;
import com.springinaction.web.spittr.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/13 20:53
 **/

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    /**
     * 注入spittleRepository
     * @param spitterrepository
     */
    @Autowired
    public SpitterController(SpitterRepository spitterrepository){
        this.spitterRepository = spitterrepository;
    }

    /**
     * get请求注册页面
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegistration(Spitter spitter){
        spitterRepository.register(spitter);
        return "redirect:/spitter/userInfo";
    }

    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String showUserInfo(Model model){
        model.addAttribute("spitter",spitterRepository.findSpitters(0));
        return "userInfo";
    }
}
