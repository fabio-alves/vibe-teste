package com.vibe.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowordController {
    
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "VIBE";
    }
    
}
