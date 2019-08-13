package com.kon.bootMailDemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"com.kon"})
@EnableConfigurationProperties
public class BootMailDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMailDemoApplication.class, args);
	}


}
