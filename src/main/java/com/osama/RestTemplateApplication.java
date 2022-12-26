package com.osama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication

public class RestTemplateApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);

    }

}
