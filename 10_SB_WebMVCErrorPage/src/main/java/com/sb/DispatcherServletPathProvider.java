package com.sb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DispatcherServletPathProvider implements org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath {

    @Value("${server.servlet.context-path}")
    private String servletContextPath;


	@Override
	public String getPath() {
		 return servletContextPath;
	}

}
