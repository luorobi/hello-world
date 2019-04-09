package com.luocx.helloworld.dao;

import com.luocx.helloworld.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-09
 * @since 1.0
 */
public interface UserDao extends JpaRepository<UserData, Long> {

    UserData findByUsername(String username);

}
