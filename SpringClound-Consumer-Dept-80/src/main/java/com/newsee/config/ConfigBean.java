package com.newsee.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConfigBean {
    @Bean
//    @LoadBalanced 暂时不要加
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
