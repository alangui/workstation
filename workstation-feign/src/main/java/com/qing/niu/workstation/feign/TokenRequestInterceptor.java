package com.qing.niu.workstation.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

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
public class TokenRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("token", UUID.randomUUID().toString());
    }
}
