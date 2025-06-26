package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/greet")
    public String  greetAPI(){
        return "Welcom to reshma's application";
    }

}
