package com.team1.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.team1.domain.MusicUserAuth;
import com.team1.domain.MusicUsers;

@Mapper
public interface MusicUserMapper {

	public int join(MusicUsers user) throws Exception;
	
	public int insertAuth(MusicUserAuth userAuth) throws Exception;
	
    // 아이디 중복 확인
    public int checkUserId(String userId) throws Exception;
	
}
