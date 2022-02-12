package com.hebici;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class poolDataSource {
    @Test
    //获取druid连接池
    public void Test() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("");
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
    }
}
