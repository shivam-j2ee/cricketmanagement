package com.kashyap.cricketmanagement;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CricketmanagementApplication  {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CricketmanagementApplication.class, args);
		System.out.println("New Project");
	}

}
