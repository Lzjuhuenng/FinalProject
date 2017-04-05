package com.lzjuhuenng.enjoybooks.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzjuhuenng.enjoybooks.pojo.*;

@Controller
public class ModelAttrAction {

	@ModelAttribute
	public void getUserInfo(String userNo, Map<String, Object> map){
		System.out.println("--------------getUserInfo-----------@ModelAttribute");
		//��ǰUserInfoΪͨ��userNo��ȡ���Ķ���
		map.put("userInfo", new UserInfo("20161206", "Сǿ6", 1, "18612345696", "xq6@zzxtit.com"));
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(UserInfo userInfo){
		
		System.out.println("**********************>" + userInfo);
		
		return "redirect:/userList";
	}
	
	@RequestMapping("/modelSayHello")
	public String sayHello(){
		return "success";
	}
	
}
