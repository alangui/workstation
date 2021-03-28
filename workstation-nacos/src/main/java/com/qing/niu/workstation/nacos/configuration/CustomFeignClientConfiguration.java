package com.qing.niu.workstation.nacos.configuration;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * </p>
 *
 * @Author Gui Jin Kang
 * @Date 2021/3/28 18:33
 * @ProjectName IntelliJ IDEA
 * @Version 1.0.0
 */
public class CustomFeignClientConfiguration extends FeignClientsConfiguration {

    @Bean
    public Logger.Level level(){
        return Logger.Level.BASIC;
    }
}
