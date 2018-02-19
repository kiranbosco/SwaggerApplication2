package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableSwagger2
public class SwaggerApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication2Application.class, args);
	}

	@Bean

	public Docket swaggerDemoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.build();
	}
	

}
