package com.suntossh.mvc.hellocontroller.annotation;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping(value="/welcome/{country}/{name}" ,method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal(@PathVariable String country, @PathVariable String name) throws Exception {
		String message= null;
		message = "I am "+name+ " and I live in "+country;
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		
		modelAndView.addObject("messageString", message);
		return modelAndView;
	}

	@RequestMapping(value="/left/{country}/{name}" ,method=RequestMethod.GET)
	protected ModelAndView handleRequestInternalMap(@PathVariable Map<String,String> map) throws Exception {
		String message= null;
		message = "I am "+map.get("name")+ " and I left "+map.get("country");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		
		modelAndView.addObject("messageString", message);
		return modelAndView;
	}
	
}
