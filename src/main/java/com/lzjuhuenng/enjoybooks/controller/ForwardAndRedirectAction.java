package com.lzjuhuenng.enjoybooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardAndRedirectAction {

	@RequestMapping("/forwardTest")
	public String forwardTest(){
		
		return "forward:WEB-INF/view/success.jsp";
	}
	
	
	@RequestMapping("/redirectTest")
	public String redirectTest(){
		
		return "redirect:WEB-INF/view/success.jsp";
	}
	
}
