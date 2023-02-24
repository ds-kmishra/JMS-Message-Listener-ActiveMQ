package com.activemq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.activemq")
@Configuration
@Import({MessageConfiguration.class})
public class AppConfig {
    // Extra Configuration
}
