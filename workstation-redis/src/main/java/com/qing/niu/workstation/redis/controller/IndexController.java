package com.qing.niu.workstation.redis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * </p>
 *
 * @Author Alan_gui
 * @Date 2021/3/17
 * @ProjectName IntelliJ IDEA
 * @Package com.qing.niu.workstation.redis.controller
 * @Version 1.0.0
 */
@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/test_sentinel")
    public void testSentinel() {
        logger.info("----------------");
        stringRedisTemplate.opsForValue().set("test", "sentinel");
    }
}
