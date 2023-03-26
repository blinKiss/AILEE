package com.team2.domain;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class Notice {
	
	private int ntNo;
	private int ntGroupNo;
	private int ntDepth;
	private int ntOrd;
	private String ntId;
	private String ntPw;
	private String ntName;
	private String ntHp;
	private String ntEmail;
	private String ntHompy;
	private String ntSubject;
	private String ntContent;
	private int ntHit;
	private LocalDateTime ntRegDate;
	
	// 첨부파일
	private MultipartFile[] files;
	

}