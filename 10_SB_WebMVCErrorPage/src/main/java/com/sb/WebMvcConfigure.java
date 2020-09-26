package com.sb;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//https://www.baeldung.com/web-mvc-configurer-adapter-deprecated

// configure welcome page for application 
@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:index.jsp");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
}
