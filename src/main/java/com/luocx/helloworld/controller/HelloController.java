package com.luocx.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello,I am SpringBoot!";
    }
}
