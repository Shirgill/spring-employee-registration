package com.company.employee.registration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.company"}, excludeFilters = {
    @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
//@ImportResource({"dao-context.xml"})

@ImportResource({"classpath:dao-context.xml"})
public class RootConfig {

}
