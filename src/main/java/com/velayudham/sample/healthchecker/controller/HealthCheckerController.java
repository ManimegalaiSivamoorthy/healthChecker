package com.velayudham.sample.healthchecker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckerController {
    @GetMapping("say_hello_from_health_checker")
    String sayHello() {
        return "Hello Sir";
    }
}
