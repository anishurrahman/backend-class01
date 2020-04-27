package com.example.backendclass01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackendClass01Application {

	public static void main(String[] args) {
		SpringApplication.run(BackendClass01Application.class, args);
	}

}
