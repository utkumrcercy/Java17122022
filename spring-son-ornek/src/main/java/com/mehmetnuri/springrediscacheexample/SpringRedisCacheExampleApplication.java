package com.mehmetnuri.springrediscacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringRedisCacheExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisCacheExampleApplication.class, args);
    }

}
