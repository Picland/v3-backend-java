package com.earth.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.earth.*.service.impl", "com.earth.*.dao.impl"})
@ImportResource({"classpath*:spring/applicationContext.xml", "classpath*:spring/springMVC-servlet.xml"})
public class EarthConfig {
}
