package com.example.ec2_jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/getname")
    public String getName() {
        return "dian";
    }
}
