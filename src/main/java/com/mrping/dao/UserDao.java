package com.mrping.dao;

import com.mrping.EntityClass.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口
 */
// 这个注解是impl里面userDao使用的
//@Repository(value = "UserDao")
@Mapper
public interface UserDao {
    //  添加用户
    void save(User user);

    //  查找全部用户
    List<User> findAll();
}
