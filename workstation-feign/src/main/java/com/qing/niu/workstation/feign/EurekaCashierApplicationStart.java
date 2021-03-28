package com.qing.niu.workstation.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/28
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.feign
 * @Version 1.0.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaCashierApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCashierApplicationStart.class, args);
    }
}
