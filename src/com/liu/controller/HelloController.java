package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/test")
	public ModelAndView test(){
		String str = "Spring MVC示例155555553fff3335599333";
		return new ModelAndView("message","str",str);
	}
}
