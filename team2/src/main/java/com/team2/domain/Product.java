package com.team2.domain;


import java.time.LocalDateTime;

//import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class Product {
	
	private int pCode;
	private String pName;
	private String pWriter;				// 저자
	private String pKind;				// 종류
	private String pImage;
	private int pPriceOrigin;			// 원가
	private int pPriceSale;				// 판매가
	private int pPriceDiscount;			// 할인가
	private int pPriceProfit;			// 이익
	private LocalDateTime pReleaseDate; // 발매일
	private String pInfo;				// 정보 ex) 책 = 쪽|크기
	private String pContent;			// 내용 ex) 책 = 소개
	private String pIndex;				// 내용 ex) 책 = 목차
	private String pIntroWriter;		// 내용 ex) 책 = 저자소개
	private String pIntroTranslator;	// 내용 ex) 책 = 역자소개
	private int pSoldout; 				// 0 - 재고있음, 1 - 품절
	private LocalDateTime pRegDate; 	// 등록일
	
	// 첨부파일
//	private MultipartFile[] files;
	

}