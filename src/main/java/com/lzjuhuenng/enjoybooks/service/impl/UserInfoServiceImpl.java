package com.lzjuhuenng.enjoybooks.service.impl;

import java.util.HashSet;
import java.util.Set;
import com.lzjuhuenng.enjoybooks.service.*;
import com.lzjuhuenng.enjoybooks.pojo.*;
import org.springframework.stereotype.Service;



@Service
public class UserInfoServiceImpl implements UserInfoService {

	Set<UserInfo> userSet = new HashSet<UserInfo>();
	
	public Set<UserInfo> getAllUser(){
		
		userSet.add(new UserInfo("20161201", "Сǿ1", 1, "18612345691", "xq1@zzxtit.com"));
		userSet.add(new UserInfo("20161202", "Сǿ2", 1, "18612345692", "xq2@zzxtit.com"));
		userSet.add(new UserInfo("20161203", "Сǿ3", 1, "18612345693", "xq3@zzxtit.com"));
		userSet.add(new UserInfo("20161204", "Сǿ4", 1, "18612345694", "xq4@zzxtit.com"));
		userSet.add(new UserInfo("20161205", "Сǿ5", 1, "18612345695", "xq5@zzxtit.com"));
		userSet.add(new UserInfo("20161206", "Сǿ6", 1, "18612345696", "xq6@zzxtit.com"));
		userSet.add(new UserInfo("20161207", "Сǿ7", 1, "18612345697", "xq7@zzxtit.com"));
		userSet.add(new UserInfo("20161208", "Сǿ8", 1, "18612345698", "xq8@zzxtit.com"));
		
		
		return userSet;
	}

	public void insertUserInfo(UserInfo uInfo) {
		userSet.add(uInfo);
	}
}
