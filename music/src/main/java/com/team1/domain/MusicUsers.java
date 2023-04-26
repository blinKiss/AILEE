package com.team1.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MusicUsers {
	private int userNo;
	private String userId;
	private String userPw;
	private String userPwChk;
	private String name;
	private String gender;
	private String age;
	private int enabled;
	private LocalDateTime regDate;
	private LocalDateTime updDate;
}
