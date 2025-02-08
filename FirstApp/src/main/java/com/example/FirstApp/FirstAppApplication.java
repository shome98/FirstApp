package com.example.FirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstAppApplication {
	public Dev dev;

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(FirstAppApplication.class, args);
		Dev obj=context.getBean(Dev.class);
	}

}
