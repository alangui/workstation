package com.qing.niu.workstation.ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/23
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.ribbon
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/cashier")
public class CashierController {

    private static Logger logger = LoggerFactory.getLogger(CashierController.class);

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("placeOrder")
    public String placeOrder(){
        logger.info("enter cashier...");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://ms-provider-user/placeOrder", String.class);
        logger.info("{}", responseEntity);
        return responseEntity.getBody();
    }
}
