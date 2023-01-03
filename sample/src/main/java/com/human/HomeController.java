package com.human;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	// 해당 클래스를 컨트롤러로 지정하는 어노테이션
public class HomeController {

	// GET 메소드로 요청매핑
	// @RequestMapping(Value = "", method = RequestMethod.GET) // 4.3버전 미만
	@GetMapping("/")	// 요청메소드를 GET 방식으로 요청경로 매핑 // 4.3버전 이상
	public String home(Model model) {
		System.out.println("메인 페이지 요청...");
		
		// 모델에 데이터 등록 : model.addAttribute("모델속성명", 값);
		model.addAttribute("data", "데이터");
		
		
		return "index"; // 응답할 뷰페이지 (HTML 파일명)
	}
}
