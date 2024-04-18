package com.example.jo_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoApiApplication.class, args);
    }

}
