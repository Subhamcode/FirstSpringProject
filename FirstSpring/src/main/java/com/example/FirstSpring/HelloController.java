package com.example.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getString(){
        return "<b>Hi Spring boot how are you</b>";
    }
}
