package com.team2.domain;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 회원
 * @author h
 *
 */
@Data
public class Users {

	private String userId;			// 아이디
	private String userPw;			// 패스워드
	private String userPwChk;		// 패스워드 확인
	private String name;			// 이름
	private String email;			// 이메일
	private String nickname;		// 닉네임
	private int enabled;			// 휴면여부
	private LocalDateTime regDate;	// 등록일자
	private LocalDateTime updDate;	// 수정일자
	private String birthday;		// 생년월일
	private String address;			// 주소
	private String addressDetail;	// 상세주소
	private String gender;			// 성별
	private int adm;				// 관리자
	
	
}

