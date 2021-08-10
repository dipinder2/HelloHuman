package com.dipinder.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="fn", required=false) String fn,
			@RequestParam(value="ln", required=false) String ln) {
		if(fn == null) {
			return "<h1>Hello Human!</h1>"
					+ "Welcome to SpringBoot";			
		}
		else {
			return "<h1>Hello "+ fn + " " + ln + "</h1><p>Welcome to springboot</p>";
		}
	}
	
}
