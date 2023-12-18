package com.CliPg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.CliPg")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
