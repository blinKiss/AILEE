package com.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * String 타입 응답
 * - return 키워드에 응답할 뷰 파일(html)을 지정하여 응답
 * ex) return "/board/read";	// board>read.html 응답
 * @author denim
 *
 */
@Slf4j
@Controller
@RequestMapping("/string")
public class StringController {

	@GetMapping("/sup")
	public String sup() {
		log.info("/string/sup.html을 지정하여 응답한다");
		return "/string/sup";
	}
	
	@GetMapping("/sup/sub")
	public String sub() {
		log.info("/string/sup/sub.html을 지정하여 응답한다");
		return "/string/sup/sub";
	}
}
