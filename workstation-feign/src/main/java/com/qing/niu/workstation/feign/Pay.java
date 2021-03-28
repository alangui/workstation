package com.qing.niu.workstation.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

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
@FeignClient(name = "ms-provider-user", configuration = PayFeignConfig.class)
public interface Pay {

    @RequestMapping("/placeOrder")
    String placeOrder();

    @RequestMapping("/token/placeOrder")
    String placeOrderWithToken();
}
