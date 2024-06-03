package com.example.demoz.controller;

import com.example.demoz.Dao.UserDaoImpl;
import com.example.demoz.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class helloController {

    @Autowired
    private UserDaoImpl userDaoImpl;

    @GetMapping("/helloz")
    public ModelAndView hello2(){
        ModelAndView hlloaModelAndView = new ModelAndView("helloz");
        hlloaModelAndView.addObject("zvalue","Test Table");

        List<UserBean> zlist = userDaoImpl.findall();
        for(UserBean user: zlist){
            System.out.println(user.getFirstnamez());
        }
        hlloaModelAndView.addObject("zusers",zlist);

        return hlloaModelAndView;
    }


}
