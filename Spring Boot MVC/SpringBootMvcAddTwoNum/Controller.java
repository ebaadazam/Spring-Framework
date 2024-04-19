package com.ebaad.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Controller {
	
	@RequestMapping("/")   // When user requests for home page, execute this method
	public String home() {
		return "index";
	}
	
	@RequestMapping("add") // When user requests for "add", execute this method
	// @RequestParam("num1") means that the Spring framework will look for a request parameter named num1
	// in the incoming HTTP request and automatically assign its value to the integer variable i.
	// And the same for the @RequestParam("num2")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2")int j) {
		
		// ModelAndView is an object that holds both the model data and the view information in a 
		// single return value. It allows a controller to return both model (data) and view (page)
		// in one return value. We have used it in place of session
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		
		int result = i+j;
		mv.addObject("result", result);
		
		return mv;
	}

}

