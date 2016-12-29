package org.springboot.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.entity.Users;
import org.springboot.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author long
 * @date 2016/10/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<Users> getUsers(){
        logger.info("从数据库读取Users集合");
        return userService.getList();
    }

}
