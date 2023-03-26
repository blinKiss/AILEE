package com.team2.service;

import java.util.List;

import com.team2.domain.Notice;
import com.team2.domain.Page;


public interface NoticeService {

	// 게시글 목록
	public List<Notice> list() throws Exception;
	
	// 게시글 조회
	public Notice read(int ntNo) throws Exception;
	
	// 게시글 등록
	public int insert(Notice notice) throws Exception;
	
	// 게시글 수정
	public int update(Notice notice) throws Exception;
	
	// 게시글 삭제
	public int delete(int ntNo) throws Exception;

	// 게시글 검색
	public List<Notice> list(String keyword) throws Exception;

	// 페이징 처리
	public List<Notice> list(Page page) throws Exception;
	
}


