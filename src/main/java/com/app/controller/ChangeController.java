package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChangeController {
    @GetMapping("/change")
    public ModelAndView change(){
        ModelAndView modelAndView = new ModelAndView("change");
        return modelAndView;
    }

    @PostMapping("/resut")
    public ModelAndView result(Double money){
        double result = money*23000;
         ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
