package com.piunivespg4.encantometrobackend.services;

import org.springframework.stereotype.Service;

@Service
public class AppServices {
    
    public String appEncantometro(String name) {

        return "Services " + name;
    }

}
