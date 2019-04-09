package com.luocx.helloworld.controller;

import com.luocx.helloworld.entity.UserData;
import com.luocx.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{username}")
    public UserData getUser(@PathVariable("username") String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/all")
    public List<UserData> getAll(){
        return userService.getAll();
    }
}
