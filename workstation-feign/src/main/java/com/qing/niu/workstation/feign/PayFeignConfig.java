package com.qing.niu.workstation.feign;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

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
public class PayFeignConfig {

    @Bean
    public Logger.Level level(){
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new TokenRequestInterceptor();
    }
}
