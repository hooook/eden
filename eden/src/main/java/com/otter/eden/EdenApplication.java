package com.otter.eden;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication(/*exclude = DataSourceAutoConfiguration.class*/)
@EnableTransactionManagement
public class EdenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdenApplication.class, args);
		log.info("测试日志444444");
	}

}
