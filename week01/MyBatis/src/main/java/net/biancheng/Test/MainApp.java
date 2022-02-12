package net.biancheng.Test;


import net.biancheng.po.Website;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainApp {
    @Test
    public  void test01() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("website-Config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Website website = new Website();
        website.setName("编程帮");
        website.setUrl("https://www.biancheng.net/");
        website.setAge(21);
        website.setCountry("CN");
        sqlSession.insert("WebsiteMapper.addWebsite",website);

        List<Website> lintWeb = sqlSession.selectList("WebsiteMapper.selectWebsite");
        for(Website website1:lintWeb)
        {
            System.out.println(website1);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
