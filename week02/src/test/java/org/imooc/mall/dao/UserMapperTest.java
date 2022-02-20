package org.imooc.mall.dao;

import org.imooc.mall.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private  UserMapper userMapper;
    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(111111);
        System.out.println(user);
    }
}