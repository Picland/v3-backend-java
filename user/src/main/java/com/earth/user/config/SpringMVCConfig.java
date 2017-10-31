package com.earth.user.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.earth.user.controller")
@ImportResource({"classpath:spring/springMVC-servlet.xml"})
public class SpringMVCConfig {
}
