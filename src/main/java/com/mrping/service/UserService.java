package com.mrping.service;

import com.mrping.EntityClass.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserService {

    void save(User user);

    List<User> findAll();
}
