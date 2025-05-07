package com.example.itcen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    @GetMapping("/")
    public @ResponseBody String getIndex() {
        return "test the conflict situation";
    }
    
}
