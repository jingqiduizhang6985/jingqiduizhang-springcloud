package com.study.eurekaribbonserviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * index
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/list")
    public String list(){
        System.out.println("service-one");
        return "service-one";
    }
}
