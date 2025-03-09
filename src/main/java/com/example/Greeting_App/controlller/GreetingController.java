package com.example.Greeting_App.controlller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "{ \"message\": \"Hello from BridgeLabz\" }";
    }
}
