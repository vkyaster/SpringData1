package com.springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
		
	}
	
	@RequestMapping("/processForm")
	public String submitForm()
	{
		return "helloworld";
		
	}
	
//	@RequestMapping("/processFormVersionTwo")
//	public String letsShoutDude(HttpServletRequest request, Model model)
//	{
//		String theName = request.getParameter("userName");
//		theName = theName.toUpperCase();
//		String result  = "Yo! "+ theName;
//		
//		model.addAttribute("message", result);
//		return "helloworld";
//		
//	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(
			@RequestParam("userName") String theName, Model model)
	{
		theName = theName.toUpperCase();
		String result  = "Yo Yo! "+ theName;
		
		model.addAttribute("message", result);
		return "helloworld";
		
	}
}
