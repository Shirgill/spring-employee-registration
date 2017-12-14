package com.company.employee.registration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc         // Enable Spring MVC
@ComponentScan(basePackages = {"com.company"})
//@ImportResource({"dao-context.xml"})
public class WebConfig extends WebMvcConfigurerAdapter {
	
}	
