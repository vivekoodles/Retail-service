package com.retail.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class RetailWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailWebsiteApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any()).build()
				.pathMapping("/").apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}

	/**
	 * This method is use for get apiInfo
	 * 
	 * @param Nothing.
	 * @return ApiInfo.
	 */
	public ApiInfo apiInfo() {
		final ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("Retail service for billing").version("1.0").license("(C) Copyright vivek")
				.description("This service provide the apis for generating bills of user")
				.contact(new springfox.documentation.service.Contact("Vivek joshi", "http://localhost:8081",
						"jvivek18@gmail.com"));
		return builder.build();
	}

}
