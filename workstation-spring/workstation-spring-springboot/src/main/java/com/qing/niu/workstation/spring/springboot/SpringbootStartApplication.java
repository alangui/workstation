package com.qing.niu.workstation.spring.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/8
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.spring.springboot
 * @Version 1.0.0
 */
@SpringBootApplication
public class SpringbootStartApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringbootStartApplication.class);

    public static void main(String[] args) {
        logger.info("启动参数:{}", (Object) args);
        SpringApplication.run(SpringbootStartApplication.class, args);
    }
}
