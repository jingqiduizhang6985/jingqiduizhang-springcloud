package com.study.eurekaribbonclientone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class IndexClientController {
    @Autowired
    private RestTemplate restTemplate;
    private String serviceId = "eureka-ribbon-service";
    @GetMapping("/list")
    public String list(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://" + serviceId + "/index/list", String.class);
        String content = forEntity.getBody();
        System.out.println(content);
        return content;
    }
}
