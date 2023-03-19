package com.mehmetnuri.springrediscacheexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {

    private List<SecurityScheme> basicScheme() {
        List<SecurityScheme> schemeList = new ArrayList<>();
        schemeList.add(new BasicAuth("basicAuth"));
        return schemeList;
    }

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2).securitySchemes(basicScheme()).select()
                .apis(RequestHandlerSelectors.basePackage("com.mehmetnuri"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Spring Boot Redis Security Hibernate Rest API")
                .description("Ücüncü bin yil Java Eğitimi için hazırlanmıştır.")
                .contact(new Contact("Mehmet Nuri", "www.mehmetnuri.com", "info@mehmetnuri.net"))
                .license("Apache License Version 2.0")
                .version("1.0.0")
                .build();
    }
}
