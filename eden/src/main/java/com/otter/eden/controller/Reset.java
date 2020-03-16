package com.otter.eden.controller;

import com.otter.eden.service.CorrectServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/rest")
public class Reset {
    @Autowired
    private CorrectServic correctServic;

    @RequestMapping(value = "/a/{username}/{password}",method = RequestMethod.GET)
    public String checkUser(@PathVariable(value = "username") String username, @PathVariable("password") String password){
        return  correctServic.checkTickets()+username+password;
    }

    @RequestMapping(value = "/b",method = RequestMethod.GET)
    public ModelAndView redirectUser(@RequestParam(value = "address",required = false,defaultValue = "abc") String address){
        ModelAndView model = new ModelAndView();
        model.addObject("message","success");
        model.setViewName("index");
        return model;
    }
}
