package com.example.itcen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    
    @GetMapping("/")
    public @ResponseBody String getIndex() {
    
        String make_title = "Hello world";
        int itcen_alarm = 0;
        if(itcen_alarm == 0){
            make_title = "It was changed Hello World";
        }
        return make_title;
    }
    
}
