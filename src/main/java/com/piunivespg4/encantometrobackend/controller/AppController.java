package com.piunivespg4.encantometrobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piunivespg4.encantometrobackend.services.AppServices;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppServices appServices;
    
    public AppController(AppServices appServices){
        this.appServices = appServices;
    }

    @GetMapping
    public String appEncantometro(){
        return appServices.appEncantometro( "Julio");
    }
    
}
