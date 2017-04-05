package com.lzjuhuenng.enjoybooks.service;

import java.util.Set;

import com.lzjuhuenng.enjoybooks.pojo.*;

import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {

	public Set<UserInfo> getAllUser();
	
	public void insertUserInfo(UserInfo uInfo);
}
