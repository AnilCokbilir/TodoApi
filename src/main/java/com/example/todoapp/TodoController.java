package com.example.todoapp;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TodoController {

    @GetMapping("/greet")
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

}
