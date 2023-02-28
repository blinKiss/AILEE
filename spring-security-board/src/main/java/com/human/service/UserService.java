package com.human.service;


import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.human.domain.Users;

public interface UserService {

	// 회원 등록
	public int join(Users user) throws Exception;

	// 토큰 인증
	public HttpSession tokenAuthentication(Users user, HttpServletRequest request) throws Exception;
}