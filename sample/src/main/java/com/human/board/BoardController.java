package com.human.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
	
	// 게시판 프로젝트
	// 게시글 목록 - 화면	GET		/board/list
	
	// 게시글 쓰기 - 화면	GET		/board/insert
	// 게시글 쓰기 - 처리	POST	/board/insert
	
	// 게시글 읽기 - 화면	GET		/board/read
	
	// 게시글 수정 - 화면	GET		/board/update
	// 게시글 수정 - 처리	PUT		/board/update

	// 게시글 삭제 - 처리	DELETE	/board/delete
	
	
	
	

	// 게시글 목록 - 화면	GET		/board/list
	@GetMapping("/board/list")
	public String list() {
		return "board/list";	// board/list.html
	}
	
	// 게시글 쓰기 - 화면	GET		/board/insert
	@GetMapping("/board/insert")
	public String insertForm() {
		return "board/insert";	// board/insert.html
	}
	
	// 게시글 쓰기 - 처리	POST	/board/insert
	@PostMapping("/board/insert")
	public String insert(@RequestParam("title") String title
						,@RequestParam("writer") String writer
						,@RequestParam("content") String content) {
		// @RequestParam("파라미터명") 타입 매개변수명
		// : 요청 파라미터를 매개변수로 가져온다
		// * 요청 파라미터명과 매개변수명이 일치하면 생략 가능
		
		System.out.println("title : " + title);
		System.out.println("writer : " + writer);
		System.out.println("content : " + content);
		
		return "redirect:/board/list";	// 게시글 쓰기 처리 후, 게시글 목록으로 리다이렉트
	}
	
	// 게시글 읽기 - 화면	GET		/board/read
	@GetMapping("/board/read")
	public String read() {
		return "board/read";
	}
	
	// 게시글 수정 - 화면	GET		/board/update
	@GetMapping("/board/update")
	public String updateForm() {
		return "board/update";
	}
	
	// 게시글 수정 - 처리	PUT		/board/update
	@PutMapping("/board/update")
	public String update(HttpServletRequest request) {
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		int boardNo = Integer.parseInt( request.getParameter("boardNo") );
		
		System.out.println("title : " + title);
		System.out.println("writer : " + writer);
		System.out.println("content : " + content);
		System.out.println("boardNo : " + boardNo);
		
		
		return "redirect:/board/read?boardNo=10";
	}
	// 게시글 삭제 - 처리	DELETE	/board/delete
	@DeleteMapping("/board/delete")
	public String delete() {
		return "redirect:/board/list";
	}
	
}
