package com.earth.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.earth.*.service.impl", "com.earth.*.controller"})
@ImportResource({"classpath:spring/applicationContext.xml", "classpath:spring/springMVC-servlet.xml"})
@Import(MyBatisConfig.class)
public class EarthConfig {
}
