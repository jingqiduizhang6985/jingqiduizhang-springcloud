package com.study.eurekafeignclientone.controller;

import com.study.eurekafeignclientone.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class IndexClientController {
    @Autowired
    private IndexService indexService;
    @GetMapping("/list")
    public String list(){
        String content = indexService.list();
        System.out.println(content);
        return content;
    }
}
