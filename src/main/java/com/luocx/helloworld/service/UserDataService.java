package com.luocx.helloworld.service;

import com.luocx.helloworld.dao.UserDao;
import com.luocx.helloworld.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
@Service
public class UserDataService {
    @Autowired
    UserDao userDao;

    //查单个
    public UserData findUserByName(String username){
        return userDao.findByUsername(username);
    }

    //查单个
    public UserData findById(Long id){
        return userDao.findById(id).get();
    }

    //查全部
    public List<UserData> findAll(){
        return userDao.findAll();
    }

    //增
    public UserData saveUser(UserData user){
        return userDao.save(user);
    }

    //改
    public UserData updateUser(UserData user){
        return userDao.saveAndFlush(user);
    }

    //删
    public void deleteUser(long id){
        userDao.deleteById(id);
    }
}
