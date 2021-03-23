package com.qing.niu.workstation.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/19
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.eureka
 * @Version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaCashierApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCashierApplicationStart.class, args);
    }
}
