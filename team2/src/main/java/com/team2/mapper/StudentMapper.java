package com.team2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.team2.domain.Students;

@Mapper
public interface StudentMapper {
	
	// 학생 정보 등록
	public int stuInfo(Students student) throws Exception;
	
	
}