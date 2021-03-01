package com.study.eurekafeignclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaFeignClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientOneApplication.class, args);
    }

}
