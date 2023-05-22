package com.team1.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.team1.domain.MusicUserAuth;
import com.team1.domain.MusicUsers;

@Mapper
public interface MusicUserMapper {

	public int join(MusicUsers user) throws Exception;
	
	public int insertAuth(MusicUserAuth userAuth) throws Exception;
	
    // 아이디 중복 확인
    public int checkUserId(String userId) throws Exception;
	
    // 프로필 사진
    public int getProfileById(String userId);

    void updateProfile(Map<String, Object> paramMap);
}
