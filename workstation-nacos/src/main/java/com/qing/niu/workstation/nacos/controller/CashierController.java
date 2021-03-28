package com.qing.niu.workstation.nacos.controller;

import com.qing.niu.workstation.nacos.feign.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @Package com.qing.niu.workstation.nacos.controller
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/cashier")
public class CashierController {

    private static Logger logger = LoggerFactory.getLogger(CashierController.class);

    @Resource
    private OrderService orderService;

    @RequestMapping("placeOrder")
    public String placeOrder(){
        logger.info("进入收银台页面");
        return orderService.placeOrder();
    }
}
