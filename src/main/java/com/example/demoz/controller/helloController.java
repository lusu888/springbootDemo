package com.example.demoz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class helloController {

    @GetMapping("/helloz")
    public ModelAndView hello2(){
        ModelAndView hlloaModelAndView = new ModelAndView("helloz");
        hlloaModelAndView.addObject("zvalue","hello ZZ");
        return hlloaModelAndView;
    }


}
