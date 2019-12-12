package com.zy.userSecurityServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhangyao
 * @create:2019-12-03 15:25
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.zy.userSecurityServer"})
public class UserSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSecurityServerApplication.class,args);
    }
}
