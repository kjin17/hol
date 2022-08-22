package com.hol.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import javax.servlet.http.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class HolApplication {

        @GetMapping("/")
        public String sayHello(HttpServletRequest request) {
                return "Hello from HOL team! your IP is: " + request.getRemoteAddr();
        }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HolApplication.class, args);
    }

}

