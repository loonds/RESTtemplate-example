package com.example.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@RestController
public class Service2Controller {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/world")
    public String world() {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofSeconds(10))
                .setReadTimeout(Duration.ofSeconds(10))
                .build();
        String response = restTemplate.getForObject("http://localhost:8081/hello", String.class);
        return "World from Service 2! " + response;
    }
}
