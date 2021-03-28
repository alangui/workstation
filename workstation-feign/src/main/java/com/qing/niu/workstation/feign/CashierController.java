package com.qing.niu.workstation.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RestController
@RequestMapping("/cashier")
public class CashierController {

    private static Logger logger = LoggerFactory.getLogger(CashierController.class);

    @Resource
    private Pay pay;

    @RequestMapping("placeOrder")
    public String placeOrder(){
        String response = pay.placeOrderWithToken();
        logger.info("{}", response);
        return response;
    }
}
