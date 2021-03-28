package com.qing.niu.workstation.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
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

    private static Logger logger = LoggerFactory.getLogger(PayController.class);

    @RequestMapping("/placeOrder")
    public String placeOrder() throws InterruptedException {
        Thread.sleep(3000L);
        return "place order success";
    }

    @RequestMapping("/token/placeOrder")
    public String placeOrderWithToken(@RequestHeader("token") String token) {
        logger.info("token:{}", token);
        return "place order success";
    }
}
