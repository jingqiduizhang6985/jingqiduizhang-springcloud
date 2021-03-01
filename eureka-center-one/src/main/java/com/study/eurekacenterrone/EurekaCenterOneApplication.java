package com.study.eurekacenterrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 单机版 注册中心 eureka
 * 参考资料：
 * https://www.cnblogs.com/shiguotao-com/p/10417740.html
 *
 * 服务启动后 访问ip地址
 * http://127.0.0.1:7000/
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterOneApplication.class, args);
    }

}
