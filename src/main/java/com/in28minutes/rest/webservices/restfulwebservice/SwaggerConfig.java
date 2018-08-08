package com.in28minutes.rest.webservices.restfulwebservice;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Configuration
// EnableSwagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public static final Contact DEFAULT_CONTACT = new Contact("Ranga Karanam", "http://www.in28minutes.com", "in28minutes@gmail.com");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Awesome API title", "Awesome API Description", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static String[] SET_VALUES = {"application/json", "application/xml"};
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet(Arrays.asList("application/json", "application/xml"));
	
	// Bean - Docket
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	// Swagger 2
	// All the paths 
	// All the api's
}
