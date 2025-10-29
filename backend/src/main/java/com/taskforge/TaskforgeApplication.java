package com.taskforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class TaskforgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskforgeApplication.class, args);
    }

    @GetMapping
    public String  hello() {
        return "Hello World";
    }

}
