package com.study.eurekafeignclientone.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-ribbon-service")
public interface IndexService {
    @GetMapping("/index/list")
     String list();
}
