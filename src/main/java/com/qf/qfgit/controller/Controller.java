package com.qf.qfgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value = "git")
public class Controller {
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("yoga711");
        return "hello";
    }
}
