package com.piunivespg4.encantometrobackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    
    @GetMapping
    public String app() {
        return "Bem vindo ao encantometro";
    }
}
