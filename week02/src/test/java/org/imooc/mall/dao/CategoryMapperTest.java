package org.imooc.mall.dao;

import org.imooc.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootApplication
public class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void findById() {
        Category id = categoryMapper.findById(100000);
        System.out.println(id);
    }
}