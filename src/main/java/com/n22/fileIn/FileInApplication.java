package com.n22.fileIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.n22.fileIn")
public class FileInApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileInApplication.class, args);
	}

}
