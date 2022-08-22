package com.example.hol;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class HolApplication {


    @GetMapping("/")
    String home() {
        return "Hello from HOL team!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HolApplication.class, args);
    }

}