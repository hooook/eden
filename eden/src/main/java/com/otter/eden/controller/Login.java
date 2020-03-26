package com.otter.eden.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Login {

    @RequestMapping(value = "/")
    public ModelAndView login(){
        ModelAndView  model = new ModelAndView();
        model.setViewName("login");
        return model;
    }
}
