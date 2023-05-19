package com.team1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.team1.domain.MusicUserAuth;
import com.team1.domain.MusicUsers;

@Mapper
public interface MusicUserMapper {

	public int join(MusicUsers user) throws Exception;
	
	public int insertAuth(MusicUserAuth userAuth) throws Exception;
	
    // 아이디 중복 확인
    public int checkUserId(String userId) throws Exception;
	
 // 프로필 업데이트
 	public int updateProfile(@Param("userId") String userId, @Param("profile") int profile) throws Exception;
}
