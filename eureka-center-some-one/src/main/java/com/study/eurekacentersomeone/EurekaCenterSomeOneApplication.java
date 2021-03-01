package com.study.eurekacentersomeone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心 高可用版
 * eureka-server-some-one
 * eureka-server-some-two
 * 服务启动后 访问ip地址
 * http://127.0.0.1:7001/
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterSomeOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterSomeOneApplication.class, args);
    }

}
