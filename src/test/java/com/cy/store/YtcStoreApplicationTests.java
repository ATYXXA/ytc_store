package com.cy.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class YtcStoreApplicationTests {

	@Autowired //自动装配
	private DataSource dataSource;

	@Test
	void contextLoads() {
	}


	//数据库连接池DBCP C3P0，这里用的是hikari管理数据库的连接对象，是springboot自带的
	@Test
	void getConnection() throws SQLException {
		System.out.println(dataSource.getConnection());
	}

}
