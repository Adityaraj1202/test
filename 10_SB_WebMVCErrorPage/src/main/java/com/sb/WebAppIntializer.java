package com.sb;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppIntializer  implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// Create Root Application Startup
		/*AnnotationConfigWebApplicationContext rootContext=new  AnnotationConfigWebApplicationContext();
		
		rootContext.register(Application.class);

		  // Manage the lifecycle of the root application context
		  container.addListener(new ContextLoaderListener(rootContext));

		  // Create the dispatcher servlet's Spring application context
		  AnnotationConfigWebApplicationContext dispatcherContext =
		                     new AnnotationConfigWebApplicationContext();
		  dispatcherContext.register(DispatcherServletAutoConfiguration.class);

		  // Register and map the dispatcher servlet
		  ServletRegistration.Dynamic dispatcher =
		    container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
		    dispatcher.setLoadOnStartup(1);
		    dispatcher.addMapping("*.do");*/
		
	}

}
