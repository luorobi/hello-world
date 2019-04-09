package com.luocx.helloworld.controller;

import com.luocx.helloworld.entity.User;
import com.luocx.helloworld.entity.UserData;
import com.luocx.helloworld.service.UserDataService;
import com.luocx.helloworld.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
@RestController
@RequestMapping("/userdata")
public class UserDataController {
    @Autowired
    UserDataService userService;

    @ApiOperation(value = "用户列表",  notes = "用户列表")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<UserData> getAllUsers(){
        List<UserData> userDataList = userService.findAll();
        return userDataList;
    }


    @ApiOperation(value = "创建用户",  notes = "创建用户")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public UserData addUser(@RequestBody UserData userData){

        return userService.saveUser(userData);
    }


    @ApiOperation(value = "获取用户详情",  notes = "获取用户详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserData addUser(@PathVariable Long id){

        return userService.findById(id);
    }

    @ApiOperation(value = "更新用户信息",  notes = "更新用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public UserData putUser(@PathVariable Long id, @RequestBody UserData userData){
        UserData user = new UserData();
        user.setId(userData.getId());
        user.setUsername(userData.getUsername());
        user.setPassword(userData.getPassword());
        return userService.updateUser(user);
    }

    @ApiOperation(value = "删除用户",  notes = "删除用户")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "success";
    }

    //@ApiIgnore 使用该注解忽略这个api

}
