package com.team1.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.team1.domain.Members;

@Mapper
public interface MemberMapper {

	// 회원 등록
	public int register(Members member) throws Exception;
	
}
