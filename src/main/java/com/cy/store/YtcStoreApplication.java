package com.cy.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cy.store.mapper")
public class YtcStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(YtcStoreApplication.class, args);
	}

}
