package com.luve2code.luv2code.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Lucky Day";
    }

}
