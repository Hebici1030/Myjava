package com.hebici.impl;

import com.hebici.Service.UserService;
import com.hebici.UserDao;

public class UserServiceImp implements UserService {
    private UserDao userdao;

    public UserServiceImp(UserDao userdao) {
        this.userdao = userdao;
    }

    @Override/*
    public void save() {
        System.out.println("set方法导入成功");
        userdao.save();
    }*/


    public void save() {
        System.out.println("constructor方法导入成功");
        userdao.save();
    }
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
}
