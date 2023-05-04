package com.team1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.team1.domain.WomanGeneration;

@Mapper
public interface WomanGenerationMapper {

	// 세대별 음악 목록
	public List<WomanGeneration> list() throws Exception;
	
	public List<WomanGeneration> selectMusicByWomanGeneration(String womanGeneration);
}
