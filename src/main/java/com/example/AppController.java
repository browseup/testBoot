package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Configuration
@Component
@Controller
public class AppController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
//        ModelAndView hello = new ModelAndView();
//        hello.setViewName("hello");


//        model.addAttribute("a", "a");
        return "hello";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(Model model) {
//        ModelAndView hello = new ModelAndView();
//        hello.setViewName("hello");


//        model.addAttribute("a", "a");
        return "hello";
    }
}
