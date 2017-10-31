package com.earth.user.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.earth.user.*.service.impl", "com.earth.user.*.dao.impl"})
//@Import() can import configs
@ImportResource({"classpath:spring/applicationContext.xml"})
public class EarthUserConfig {
}
