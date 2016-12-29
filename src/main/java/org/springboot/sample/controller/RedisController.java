package org.springboot.sample.controller;

import org.springboot.sample.service.RedisService;
import org.springboot.sample.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author long
 * @date 2016/12/15
 */
@Controller
public class RedisController {

    @Autowired
    RedisService redisService;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/testRedis")
    @Cacheable(value="test")
    public String getSessionId(HttpSession session){
        redisUtil.set("123", "测试");
        System.out.println("进入了方法");
        String string= redisUtil.get("123").toString();
        return string;
    }

}
