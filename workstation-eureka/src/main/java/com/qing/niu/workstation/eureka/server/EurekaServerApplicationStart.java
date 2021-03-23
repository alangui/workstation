package com.qing.niu.workstation.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

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
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplicationStart.class, args);
    }
}
