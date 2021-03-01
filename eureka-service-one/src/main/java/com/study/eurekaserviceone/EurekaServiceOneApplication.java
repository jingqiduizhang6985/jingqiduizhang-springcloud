package com.study.eurekaserviceone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 需要注册到注册中心上的其中一个服务
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceOneApplication.class, args);
    }

}
