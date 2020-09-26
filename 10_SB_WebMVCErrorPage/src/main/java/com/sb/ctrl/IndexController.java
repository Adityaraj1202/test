package com.sb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	
	
	
	@GetMapping("/welcome.do")
	public String returnWelcome() {
		return "welcome";
	}
	
	@GetMapping("/error.do")
	public String returnError() {
		return "welcome";
	}
	
	@GetMapping("/other.htm")
	public String returnOther() {
		return "welcome";
	}
	
}
