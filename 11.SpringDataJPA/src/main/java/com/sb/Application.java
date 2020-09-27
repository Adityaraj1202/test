package com.sb;
//Sorting and Pagination 
// https://www.baeldung.com/spring-data-jpa-pagination-sorting
	

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sb.service.MobileService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//MobileService service=(MobileService) ctx.getBean("mobileService");
		//service.doCRUDOperation();
	}

}
