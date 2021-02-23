package com.study.eurekaserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 参考资料：
 * https://www.cnblogs.com/shiguotao-com/p/10417740.html
 *
 * 服务启动后 访问ip地址
 * http://127.0.0.1:9001/
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerOneApplication.class, args);
    }

}
