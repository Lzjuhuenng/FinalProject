package com.lzjuhuenng.enjoybooks.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lzjuhuenng.enjoybooks.pojo.*;

@Controller
//@SessionAttributes(names={"userInfo"}, types={UserInfo.class, String.class})
@SessionAttributes(types={UserInfo.class, String.class})
public class SessionAttrAction {


	/**
	 * ͨ��@SessionAttributes��HttpSession���������ԣ�
	 * ʹ��@SessionAttributes������Namesʱ��model�е�����������ҪҪ��@SessionAttributes������Names�е�ֵ��ͬ��
	 * 
	 * Ҳ����ʹ��@SessionAttributes��Types����
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/sessionAttrTest")
	public String setSessionTest(Map<String, Object> map){
		
		map.put("user", new UserInfo("20161201", "Сǿ1", 1, "18612345691", "xq1@zzxtit.com"));
		map.put("userInfo", new UserInfo("20161202", "Сǿ2", 1, "18612345692", "xq2@zzxtit.com"));
		
		return "sessionAttr";
	}
	
	@RequestMapping("/completeSession")
	public String completeSession(SessionStatus status){
		status.setComplete();
		return "sessionAttr";
	}
	
	
}
