package com.xebia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.xebia.application"})
//@EnableAutoConfiguration (exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
//@EnableJpaRepositories("com.xebia.application.repository")
public class TaskToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskToDoApplication.class, args);
	}
}
