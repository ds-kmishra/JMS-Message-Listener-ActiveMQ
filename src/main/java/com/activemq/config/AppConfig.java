package com.activemq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.activemq")
@Import({ MessageConfiguration.class, MessageListenerConfiguration.class })
public class AppConfig {
}
