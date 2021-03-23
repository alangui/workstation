package com.qing.niu.workstation.eureka.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/23
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.eureka.provider
 * @Version 1.0.0
 */
@RestController
public class PayController {

    @RequestMapping("/placeOrder")
    public String placeOrder(){
        return "place order success";
    }
}
