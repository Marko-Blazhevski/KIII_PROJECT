package com.example.kiii_project_final;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class HelloController {

    @GetMapping()
    public String helloWorld() {
        return "Hello World!!";
    }

}
