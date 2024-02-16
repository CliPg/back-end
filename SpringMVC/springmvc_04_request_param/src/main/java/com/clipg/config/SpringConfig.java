package com.clipg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.clipg.service","com.clipg.dao"})
public class SpringConfig {
}
