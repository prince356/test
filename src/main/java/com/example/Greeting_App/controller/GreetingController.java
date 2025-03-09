package com.example.Greeting_App.controller;

import com.example.Greeting_App.model.Greeting;
import com.example.Greeting_App.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam(required = false) String firstName,
                                 @RequestParam(required = false) String lastName) {
        return greetingService.saveGreeting(firstName, lastName);
    }
}
