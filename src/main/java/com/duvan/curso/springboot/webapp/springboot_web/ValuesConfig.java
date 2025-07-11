package com.duvan.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
	@PropertySource(value = "classpath:values.properties",encoding = "UTF-8"),
})
@Configuration
public class ValuesConfig {

}
