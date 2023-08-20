package com.jnkTest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class DemoController {
    @GetMapping("/test")
    public String test(){
        return "new version  ";
    }
    @GetMapping("/pop")
    public String pop(){
        return "new version 10.1.9 ";
    }
}
