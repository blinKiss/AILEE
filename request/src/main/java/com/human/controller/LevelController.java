package com.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 클래스 레벨 매핑
 * : 요청 경로들의 공통되는 기본 경로를 클래스에 지정하는 것
 * 
 * @RequesetMapping
 * - method  : Http 요청 메소드를 매핑하는 속성
 *   * RequestMethod.GET
 *   * RequestMethod.POST
 *   * RequestMethod.PUT
 *   * RequestMethod.DELETE
 *  
 * ------------------------------------------------
 * 
 * 요청 경로 매핑 단축 어노테이션
 * @GetMapping("요청경로")
 * @PostMapping("요청경로")
 * @PutMapping("요청경로")
 * @DeleteMapping("요청경로")
 * 
 * ------------------------------------------------
 * 
 * 경로 패턴 매핑
 * @XXXMapping("/~/{변수}")
 * @PathVariable("변수") 타입 매개변수명
 * : 요청 경로를 동적으로 표현가능하도록 지정
 * - URL에 변하는 값을 변수로 지정할 수 있다
 * * 요청 경로에 지정한 변수와 매개변수명이 일치하면,
 *   @PathVariable 어노테이션에 변수지정을 생략할 수 있다
 *   ex) @XXXMapping("/board/read/{boardNo}")
 *       @PathVariable int boardNo
 * - /board/read?boardNo=10
 * - /board/read/10
 * 
 * 
 * * @author denim
 * 게시판 요청 경로 매핑
 * - /board/list
 * - /board/insert
 * - /board/read
 * - /board/update
 * - /board/delete
 * 
 */
@Slf4j
@Controller
@RequestMapping("/board")
public class LevelController {
	
	// 타임리프 템플릿 엔진 사용 시,
	// 컨트롤러 메소드의 반환타입을 void로 하면
	// 요청경로와 동일한 위치에 있는 html파일이 응답하도록 연결해준다
	// ex) @GetMapping("/list")	public void list() {}
	// 		-> board > list.html 파일을 응답해준다

//	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@GetMapping("/list")
	public void list() {
		log.info("GET - /board/list");
		
	}
	
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	@GetMapping("/insert")
	public void insert() {
		log.info("GET - /board/insert");
	}
	
//	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@PostMapping("/insert")
	public void insertPost() {
		log.info("POST - /board/insert");
	}
	
//	@RequestMapping(value = "/read", method = RequestMethod.GET)
	@GetMapping("/read/{boardNo}")
	public String read(@PathVariable("boardNo") int boardNo) {
		log.info("GET - /board/read");
		log.info("boardNo : " + boardNo);
		
		return "/board/read";
	}
	
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@GetMapping("/update/{boardNo}")
	public String update(@PathVariable int boardNo) {
		log.info("GET - /board/update");
		log.info("boardNo : " + boardNo);
		
		return "/board/update";
	}
	
//	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@PutMapping("/update")
	public void updatePut() {
		log.info("PUT - /board/update");
	}
	
//	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@DeleteMapping("/delete")
	public void delete() {
		log.info("DELETE - /board/delete");
	}
}
