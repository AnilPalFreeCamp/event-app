package com.push.naf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.demo","com.naf","com.push"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}  

}
