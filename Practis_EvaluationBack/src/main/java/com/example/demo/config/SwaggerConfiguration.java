package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;

@Configuration
@EnableSwagger2
@EnableWebMvc

public class SwaggerConfiguration {

	@Bean
	public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2)
	.select()
	.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
	.paths(PathSelectors.any())
	.build()
	.apiInfo(metadata())

	.tags(new Tag("Authorization Rest API", "Defines endpoints that can be hit only when the user is not logged in. It's not secured by default."),
	new Tag("User Rest API", "Defines endpoints for the logged in user. It's secured by default."));
	}



	private ApiInfo metadata() {
	return new ApiInfoBuilder()
	.title("Prueba API")
	.description("Prueba")
	.version("1.0-SNAPSHOT")
	.license("").licenseUrl("")//
	.contact(new Contact(null, null, "jdsolis@estudiante.uniajc.edu.co"))
	.build();
	}


}
