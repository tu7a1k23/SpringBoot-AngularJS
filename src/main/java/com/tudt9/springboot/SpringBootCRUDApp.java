package com.tudt9.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.tudt9.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.tudt9.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
