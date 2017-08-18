package com.demo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mvcController {

    @RequestMapping(value="/hello")
    public String hello(ModelMap model){  
    	model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
    @RequestMapping(value="/hello1")
    public String hello1(ModelMap model){    
    	model.addAttribute("message", "Spring 3 MVC Hello1 World");
        return "hello1";
    }

}