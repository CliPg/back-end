package com.CliPg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")//单例
@ComponentScan("com.CliPg")
public class SpringConfig {
}
