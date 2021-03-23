package com.qing.niu.workstation.ribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/23
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.ribbon
 * @Version 1.0.0
 */
@Configuration
public class MainConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
