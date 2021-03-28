package com.qing.niu.workstation.nacos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @Author Gui Jin Kang
 * @Date 2021/3/28 18:47
 * @ProjectName IntelliJ IDEA
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/order")
public class OrderServiceController {

    private static Logger logger = LoggerFactory.getLogger(OrderServiceController.class);

    @RequestMapping("placeOrder")
    public String placeOrder(){
        logger.info("接受到下订单请求。。。");
        return "下单成功";
    }
}
