package com.newsee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class SpringCloudPDeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPDeptApplication.class);
    }
}
