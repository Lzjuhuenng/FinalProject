package com.lzjuhuenng.enjoybooks.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMethodAction {

	private final Log log = LogFactory.getLog(RequestMethodAction.class);
	
	@RequestMapping(value="/rmTest", method={RequestMethod.GET})
	public String requestMethodGetTest(){
		log.info("================requestMethodGetTest===================================");
		return "success";
	}
	
	@RequestMapping(value="/rmTest", method={RequestMethod.POST})
	public String requestMethodPostTest(){
		log.info("================requestMethodPostTest===================================");
		return "success";
	}
	
	@RequestMapping(value="/rmTest", method={RequestMethod.PUT})
	public String requestMethodPutTest(){
		log.info("================requestMethodPutTest===================================");
		return "success";
	}
	
	
	@RequestMapping(value="/rmTest", method={RequestMethod.DELETE})
	public String requestMethodDELETETest(){
		log.info("================requestMethodDELETETest===================================");
		return "success";
	}
	
	
	
	@RequestMapping("/rmTestJsp")
	public String rmTestJsp(){
		
		return "rmTest";
	}
}
