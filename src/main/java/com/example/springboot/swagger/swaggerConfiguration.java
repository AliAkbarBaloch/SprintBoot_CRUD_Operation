package com.example.springboot.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class swaggerConfiguration {

	@Bean
	public Docket restAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				 .apiInfo(getInfo()).select()
				 .apis(RequestHandlerSelectors.any())
				 .paths(PathSelectors.any())
				 .build();
		
	}

	private ApiInfo getInfo() {
		return new ApiInfo("CRUD Operation","This Project is Developed by Ali Akbar","1.0","Terms of Service", new Contact("ALi","alibaloch3871@gmail.com","Hello"),"License of API","API license URL",Collections.emptyList());
	}
	
}
