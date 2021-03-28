package com.qing.niu.workstation.nacos.feign;

import com.qing.niu.workstation.nacos.configuration.CustomFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * </p>
 *
 * @Author Gui Jin Kang
 * @Date 2021/3/28 18:30
 * @ProjectName IntelliJ IDEA
 * @Version 1.0.0
 */
@FeignClient(name = "order-center", configuration = CustomFeignClientConfiguration.class)
public interface OrderService {

    @PostMapping("/order/placeOrder")
    public String placeOrder();
}
