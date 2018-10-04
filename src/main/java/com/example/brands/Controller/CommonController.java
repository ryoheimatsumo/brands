package com.example.brands.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        mav.addObject();
        
    }

}