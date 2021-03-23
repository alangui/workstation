package com.qing.niu.workstation.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/18
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.eureka
 * @Version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderClientApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderClientApplicationStart.class, args);
    }
}
