package com.example.service2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Service2Config {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
