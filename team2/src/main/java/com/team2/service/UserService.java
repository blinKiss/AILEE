package com.team2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.team2.domain.Users;

public interface UserService {

	// 회원 등록
	public int join(Users user) throws Exception;
	
	// 토큰 인증
	public HttpSession tokenAuthenticaion(Users user, HttpServletRequest request) throws Exception;
	
	
}