package com.team2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.team2.domain.UserAuth;
import com.team2.domain.Users;

@Mapper
public interface UserMapper {
	
	// 회원 등록
	public int join(Users user) throws Exception;
	
	// 권한 등록
	public int insertAuth(UserAuth userAuth) throws Exception;
	

}