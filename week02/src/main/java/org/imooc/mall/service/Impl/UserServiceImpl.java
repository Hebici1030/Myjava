package org.imooc.mall.service.Impl;


import org.imooc.mall.dao.UserMapper;
import org.imooc.mall.pojo.User;
import org.imooc.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
      //处理注册业务逻辑
        int byemail = userMapper.selectByemail(user.getEmail());
        int byusername = userMapper.selectByusername(user.getUsername());
        if(byemail==1||byusername==1){
            throw new RuntimeException("用户名或邮箱已被注册");
        }

        DigestUtils.md5Digest(user.getPassword().getBytes(StandardCharsets.UTF_8));

        int selective = userMapper.insertSelective(user);
        if(selective==0){
            throw  new RuntimeException("注册失败");
        }

    }
}
