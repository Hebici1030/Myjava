package com.hebici.Demo;

import com.hebici.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userControoler {

    @Test
    public void test01()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfig.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
