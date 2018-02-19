package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@RestController
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
	@RequestMapping(value="/getmethdoInfo",method=RequestMethod.GET)
	public String demo() {
		return "success";
		
	}
	
	@RequestMapping(value="/postMethod",method=RequestMethod.POST)
	public String postDemo(@RequestBody Demo demo) {
		
		System.out.println("post api success" + demo.getDemo_id());
		System.out.println("post api success" + demo.getDemo_name());
		return "post Api Success";
		
	}
	
	
	
	
	
	
}
