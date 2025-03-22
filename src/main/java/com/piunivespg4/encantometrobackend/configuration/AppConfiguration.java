package com.piunivespg4.encantometrobackend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfiguration {

    @Bean
    public SDKAWS sdkAWS() {
        return new SDKAWS)();
    }

}
