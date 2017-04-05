package com.lzjuhuenng.enjoybooks.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lzjuhuenng.enjoybooks.service.*;
import com.lzjuhuenng.enjoybooks.pojo.*;

@Controller
public class UserInfoAction {
	
	private final Log log = LogFactory.getLog(UserInfoAction.class);
	
	@Autowired
	private UserInfoService userInfoService;

	//private UserInfoService userInfoService = new UserInfoServiceImpl();

	/**
	 * 
	 * @param map
	 */
	@ModelAttribute
	public void getGenders(Map<String, Object> map){
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("1", "��");
		genderMap.put("0", "Ů");
		map.put("genderMap", genderMap);
	}
	
	@RequestMapping("/addInit")
	public String addInit(){
		
		return "userinfo/user_insert";
	}
	
	/**
	 * �û���Ϣ��ӡ�����
	 * @RequestParam ��ȡ�û��ύ�Ĳ�����Ϣ
	 * 	����name����Form���е�name����ֵ
	 * 	����defaultValue�������û���ύ�˲�������ʹ��Ĭ��ֵ
	 * 	����required�����û��ύ��Ϣʱ�������ύ�˲����������׳��쳣��requiredĬ��ֵΪtrue;
	 * 
	 * @RequestParam ����ʡ�Բ�д���������Ʊ�����form��Name����ֵ����һ�²��ܽ�����Ϣ
	 * 
	 * @return
	 */
	@RequestMapping("insertUser")
	public String insertUser(UserInfo uInfo){
		userInfoService.insertUserInfo(uInfo);
		log.info("UserInfo-------------------------------->" + uInfo.toString());
		return "redirect:/userList";
	}
	
	
	
	/**
	 * �û���Ϣɾ��������
	 * @return
	 */
	@RequestMapping("deleteUser")
	public String deleteUser(){
		return "userinfo/user_insert";
	}
	
	/**
	 * �û���Ϣ�޸ġ�����
	 * @return
	 */
	@RequestMapping("updateUserInfo")
	public String updateUser(UserInfo userInfo){
		/**
		 * ʵ����һ���µ��û���Ϣ����Ȼ����ύ�������û���Ϣ���и���
		 * ������µ��ֶζ�ΪNUll
		 * UserInfo userInfo = new UserInfo();
		 * userInfo.setUserName("adsfas");
		 * userInfo.setEmail("");
		 * userInfo.setUserNo("");
		 */
		
		/**
		 * ��ͨ���û���Ų�ѯ�û���Ϣ��Ȼ����ύ�������û���Ϣ���и��¡�
		 * ������µ��ֶζ�Ϊԭ���ݿ��е�ֵ
		 * UserInfo userInfo = DB.getUserInfo(userNo);
		 * userInfo.setUserName("adsfas");
		 * userInfo.setEmail("");
		 * userInfo.setUserNo("");
		 * 
		 * 
		 */
		
		return "userinfo/user_insert";
	}
	
	@RequestMapping("updateInit")
	public String updateInit(String userNo, Map<String, Object> map){
		map.put("userInfo", new UserInfo("20161201", "Сǿ1", 1, "18612345691", "xq1@zzxtit.com"));
		
		return "userinfo/user_update";
	}
	
	
	/**
	 * �û���Ϣ��ѯ������
	 * @return
	 */
	@RequestMapping("/userList")
	public ModelAndView userList(){
		
		//��ModelAndView������ͼ��Ϣ
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userinfo/userList");
		
		mav.addObject("userData", userInfoService.getAllUser());
		
		return mav;
	}
	
	/**
	 * �û���Ϣ��ѯ������
	 * @return
	 */
	@RequestMapping("/userListPage")
	public String userListPage(Map<String, Object> map){
		map.put("userData", userInfoService.getAllUser());
		return "userinfo/userList";
	}

	@RequestMapping("/testURl/**/hello")
	public String testURL(){
		
		System.out.println("______------------------------testURL");
		return "success";
	}
	//@PathVariable(name="userName")
	@RequestMapping("/testPath/{userName}")
	public String testPath(@PathVariable(name="userName") String userName){
		
		log.info("=============================>" + userName);
		
		return "success";
	}
	
}
