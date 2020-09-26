package com.sb;
//https://www.youtube.com/watch?v=N2afx4KljvU
// https://www.baeldung.com/spring-boot-custom-error-page

import java.util.Properties;

import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
public class Application {

	// http://localhost:4356/MVCErrorPage/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//DispatcherServlet servlet =  context.getBean(DispatcherServlet.class);
		//System.out.println("==========>>>>>"+servlet.getHandlerMappings());
	}
	
	/*@Bean
	public SimpleUrlHandlerMapping sampleServletMapping() {
	    SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
	    mapping.setOrder(Integer.MAX_VALUE - 2);
	    Properties urlProperties = new Properties();
	    urlProperties.put("/welcome.do", "/welcome");
	    mapping.setMappings(urlProperties);
	    return mapping;
	}*/
	
	@Bean
	public ServletRegistrationBean<Servlet> dispatcherServletRegistration() {
		ServletRegistrationBean<Servlet> registration = new ServletRegistrationBean(new DispatcherServlet());
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		registration.addUrlMappings("*.do");
		//System.out.println("==> "+registration.getUrlMappings());
		//System.out.println("==========>>>>>"+servlet.getHandlerMappings());
		return registration;
	}
	@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    bean.setPrefix("/WEB-INF/views/");
	    bean.setSuffix(".jsp");
	    return bean;
	}
}
