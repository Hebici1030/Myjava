package org.imooc.mall.service.impl;

import org.imooc.mall.enums.malluser;
import org.imooc.mall.pojo.User;
import org.imooc.mall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)

public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void Test(){
        User user = new User();
        user.setEmail("2257714950@qq.com");
        user.setRole(malluser.AMDIN.getCode());
        Date date = new Date();
        user.setCreatimeTime(date);
        user.setUpdateTime(date);
        user.setUsername("何必词");
        user.setPassword("123456");
        userService.register(user);

    }
}