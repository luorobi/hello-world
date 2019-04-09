package com.luocx.helloworld.controller;

import com.luocx.helloworld.entity.ConfigBean;
import com.luocx.helloworld.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LuocxController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "luocx")
    public String luocx(){
        return configBean.getGreeting() +
                "-" +configBean.getName() +
                "-" + configBean.getUuid() +
                "-" + configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping(value = "user")
    public String user(){
        return user.getName() + "-" +user.getAge();
    }
}
