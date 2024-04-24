package com.ebaad.SpringMvcModelAttrDemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebaad.SpringMvcModelAttrDemo.model.Watch;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	// We are accepting the individual values and then we are assigning them to the object here. So instead of RequestParam we
	// simply mention the Watch object here in the parenthesis and the names will be assigned automatically to Watch object and 
	// that can be possible through the ModelAttribute
//	@RequestMapping("addWatch")
//	public String addWatch(@RequestParam("price") int price, @RequestParam("model") String model, Model m) {
//		
//		Watch w = new Watch();
//		w.setPrice(price);
//		w.setModel(model);
//		
//		// Adding the data into the Model object
//		m.addAttribute("wforwatch", w); // whatever data is there in 'w' will be represented as 'wforwatch' in the result.jsp page
//		return "result";
//	}
	
	// Using the Model Attribute
	@RequestMapping("addWatch")
	public String addWatch(@ModelAttribute Watch w, Model m) // Now whatever comes from the client will be assigned to 'w'
	// We can also pass the name to be sent to the result page in the parenthesis of ModelAttribute
	{	
		// Adding the data into the Model object
		m.addAttribute("wforwatch", w); // whatever data is there in 'w' will be represented as 'wforwatch' in the result.jsp page
		return "result";
	}
}

