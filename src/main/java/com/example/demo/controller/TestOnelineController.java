package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestOnelineController {
    @RequestMapping("/testonline")
    public String testonline(){
        return "/testonline";
    }
}
