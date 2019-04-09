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
public class UserService {
    @Autowired
    private UserDao userDao;

    public UserData findByUsername(String username){
        return userDao.findByUsername(username);
    }

    public List<UserData> getAll(){
        return userDao.findAll();
    }
}
