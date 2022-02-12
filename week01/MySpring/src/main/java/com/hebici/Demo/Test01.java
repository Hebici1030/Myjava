package com.hebici.Demo;

import com.hebici.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void UserTest()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfig.xml");
        UserDao user = (UserDao) applicationContext.getBean("user");
        user.save();
    }
}
