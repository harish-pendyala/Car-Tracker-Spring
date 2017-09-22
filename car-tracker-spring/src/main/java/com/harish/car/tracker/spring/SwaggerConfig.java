package com.harish.car.tracker.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
//				.pathMapping("/api/*")
				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo(){
		Contact contact = new Contact("Harish Pendyala", "https://github.com/harish-pendyala/Car-Tracker-Spring", "harish.pendyala1@gmail.com");
		ApiInfo info = new ApiInfo("Car Tracker Spring REST API", "A simple REST API fro tracking the Car", "1.0.0", "Tnc", contact, "MIT", "https://opensource.org/licences/MIT");
		return info;
		
	}

}
