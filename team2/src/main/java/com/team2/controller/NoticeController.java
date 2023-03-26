package com.team2.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.multipart.MultipartFile;

import com.team2.domain.Files;
import com.team2.domain.Notice;
import com.team2.domain.Page;
import com.team2.service.FileService;
import com.team2.service.NoticeService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class NoticeController {
	
	// 게시판 프로젝트
	// Controller
	// - 요청경로 매핑
	// 게시글 목록 - 화면		GET 	/notice/list
	
	// 게시글 쓰기 - 화면		GET 	/notice/insert
	// 게시글 쓰기 - 처리		POST	/notice/insert
	
	// 게시글 읽기 - 화면		GET		/notice/read
	
	// 게시글 수정 - 화면		GET		/notice/update
	// 게시글 수정 - 처리		PUT		/notice/update
	
	// 게시글 삭제 - 처리		DELETE	/notice/delete

	@Autowired
	private NoticeService service;
	
	@Autowired
	private FileService fileService;
	
	/**
	 * 게시글 목록 - 화면		GET 	/notice/list
	 * - 전체 게시글 목록 조회
	 * - 게시글 목록을 모델에 등록
	 * - /notice/list.html 뷰를 응답
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/notice/list")
	public String list(Model model, Page page) throws Exception {
		
		List<Notice> noticeList = service.list(page);
		
		log.info("page : " + page);
		model.addAttribute("page", page);
		model.addAttribute("noticeList", noticeList);
		
		return "/notice/list";		// notice/list.html
	}
	
	/**
	 * 게시글 검색
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping(path = "/notice/list", params = "keyword")
	public String search(Model model, String keyword) throws Exception {
		
		// 게시글 검색 요청
		List<Notice> noticeList = service.list(keyword);
		
		model.addAttribute("noticeList", noticeList);
		
		return "/notice/list";		// notice/list.html
	}
	
	/**
	 * 게시글 쓰기 - 화면		GET 	/notice/insert
	 * - /notice/insert.html 뷰를 응답
	 * @return
	 */
	@GetMapping("/notice/insert")
	// @PreAuthorize("hasRole('USER')")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String insertForm(Principal principal, Model model) {
		
		String userId = principal.getName();	// 아이디
		log.info("userId : " + userId);
		
		model.addAttribute("userId", userId);
		
		return "/notice/insert";		// notice/insert.html
	}
	
	/**
	 * 게시글 쓰기 - 처리		POST	/notice/insert
	 * - (제목/작성자/내용)을 요청파라미터로 전달 받음
	 * - 게시글을 등록 처리
	 * - 게시글 목록으로 리다이렉트 → /notice/list.html 뷰를 응답
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/notice/insert")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String insert(Notice notice) throws Exception {
		//  MultipartFile : 전송된 파일데이터를 다루는 인터페이스
		
		MultipartFile[] files = notice.getFiles();
		
		if( files != null || files.length == 0 ) {
			// 요청된 첨부파일 확인
			for (MultipartFile file : files) {
				String fileName = file.getOriginalFilename();		// 파일 명
				String contentType = file.getContentType();			// 파일 타입(확장자)
				long size = file.getSize();							// 용량
				byte[] fileData = file.getBytes();					// 파일 데이터
				
				log.info("fileName : " + fileName);
				log.info("contentType : " + contentType);
				log.info("size : " + size);
			}
		}
		
		int result = service.insert(notice);
		
		return "redirect:/notice/list";		// 게시글 쓰기 처리 후, 게시글 목록으로 리다이렉트
	}
	
	@GetMapping("/notice/read")
	public String readWarning() {
		
		return "/notice/warning";
	}
	
	/**
	 * 게시글 읽기 - 화면		GET		/notice/read
	 * - 게시글 번호를 요청파라미터로 전달 받음
	 * - 게시글 번호로 게시글 정보 조회
	 * - 게시글 정보를 모델에 등록
	 * - /notice/read.html 뷰를 응답
	 * @param model
	 * @param boardNo
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(path = "/notice/read", params = "ntNo")
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
	public String read(Model model, int ntNo, Files file, Principal principal) throws Exception {
		// 게시글 번호로 게시글 정보를 조회
		System.out.println("게시글 조회...");
		System.out.println("ntNo : " + ntNo);
		
		// 게시글 조회
		Notice notice = service.read(ntNo);
		
		// 작성자 본인 확인
		String loginUserId = principal.getName();
		String noticeUserId = notice.getNtId();
		
		boolean ntId = false;		// 작성자 본인 여부
		if( loginUserId.equals(noticeUserId) ) {
			ntId = true;
		}
		
		// 파일 목록 조회
		file.setParentTable("notice");
		file.setParentNo(ntNo);
		List<Files> fileList = fileService.listByParentNo( file );
		
		
		model.addAttribute("ntId", ntId);		
		model.addAttribute("ntNo", ntNo);
		model.addAttribute("notice", notice);
		model.addAttribute("fileList", fileList);
		return "/notice/read";
	}
	
	
	@GetMapping("/notice/update")
	public String updateWarning() {
		
		return "/notice/warning";
	}
	
	/**
	 * 게시글 수정 - 화면		GET		/notice/update
	 * - 게시글 번호를 요청파라미터로 전달 받음
	 * - 게시글 번호로 게시글 정보 조회
	 * - 게시글 정보를 모델에 등록
	 * - /notice/update.html 뷰를 응답
	 * @param model
	 * @param boardNo
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(path = "/notice/update", params = "ntNo")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String updateForm(Model model, int ntNo, Principal principal) throws Exception {
		// 게시글 번호로 게시글 정보를 조회
		System.out.println("게시글 조회(수정화면)...");
		System.out.println("ntNo : " + ntNo);
		
		Notice notice = service.read(ntNo);
		
		// 작성자 본인 확인
		String loginUserId = principal.getName();
		String noticeUserId = notice.getNtId();
		
		boolean ntId = false;		// 작성자 본인 여부
		if( loginUserId.equals(noticeUserId) ) {
			ntId = true;
		}
		
		model.addAttribute("ntId", ntId);
		model.addAttribute("ntNo", ntNo);
		model.addAttribute("notice", notice);
		return "/notice/update";
	}
	
	/**
	 * 게시글 수정 - 처리		PUT		/notice/update
	 * - 수정할 (게시글번호/제목/작성자/내용) 요청파라미터로 전달 받음
	 * - 게시글 번호를 조건으로 게시글 정보 수정 처리
	 * - 게시글 읽기로 리다이렉트 → /notice/read.html 응답
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@PutMapping("/notice/update")
	public String update(HttpServletRequest request) throws Exception {
		// HttpServletRequest
		// - 클라이언트의 요청과 관련한 기능을 사용할 수 있는 요청객체
		// - getParameter("파라미터명")   : 요청 파라미터의 값을 가져온다	
		//   * 파라미터명 
		//   - form요청 (input 태그의 name 속성 지정한 파라미터명)
		//   - URL의 쿼리스트링의 파라미터 localhost:8080/~~~?title=제목&writer=작성자&content=내용
		String ntSubject = request.getParameter("ntSubject");
		String ntId = request.getParameter("ntId");
		String ntContent = request.getParameter("ntContent");
		int ntNo = Integer.parseInt( request.getParameter("ntNo") );
		
		Notice notice = new Notice();
		notice.setNtNo(ntNo);
		notice.setNtSubject(ntSubject);
		notice.setNtId(ntId);
		notice.setNtContent(ntContent);
		
		int result = service.update(notice);
		
		System.out.println("ntSubject : " + ntSubject);
		System.out.println("ntId : " + ntId);
		System.out.println("ntContent : " + ntContent);
		System.out.println("ntNo : " + ntNo);
		return "redirect:/notice/read?ntNo=" + ntNo;
	}
	
	/**
	 * 게시글 수정 - 처리		POST		/notice/update
	 * - 수정할 (게시글번호/제목/작성자/내용) 요청파라미터로 전달 받음
	 * - 게시글 번호를 조건으로 게시글 정보 수정 처리
	 * - 게시글 읽기로 리다이렉트 → /notice/read.html 응답
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/notice/update")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String updatePost(Notice notice, Principal principal) throws Exception {
		// 요청 파라미터명과 일치하는 변수명을 가지고 있는 객체를 사용하여 여러 파라미터를 가져올 수 있다.
		int ntNo = notice.getNtNo();
		String ntSubject = notice.getNtSubject();
		String ntId = notice.getNtId();
		String ntContent = notice.getNtContent();
		
		// 작성자 본인 아닐 때, 다시 수정페이지로 리다이렉트
		String loginUserId = principal.getName();
		if( !ntId.equals(loginUserId) ) {
			return "redirect:/notice/update?ntNo=" + ntNo;
		}
		
		// 게시글 수정 요청
		int result = service.update(notice);
		
		System.out.println("ntSubject : " + ntSubject);
		System.out.println("ntId : " + ntId);
		System.out.println("ntContent : " + ntContent);
		System.out.println("ntNo : " + ntNo);
		return "redirect:/notice/read?ntNo=" + ntNo;
	}
	
	/**
	 * 게시글 삭제 - 처리		DELETE	/notice/delete
	 * - 게시글 번호를 요청파라미터로 전달 받음
	 * - 게시글 번호를 조건으로 게시글 정보를 삭제 처리
	 * - 게시글 목록으로 리다이렉트 → /notice/list.html 응답
	 * @param boardNo
	 * @return
	 * @throws Exception 
	 */
	@DeleteMapping("/notice/delete")
	public String delete(int ntNo) throws Exception {
		// 게시글 번호로 게시글 삭제
		System.out.println("ntNo : " + ntNo);
		
		int result = service.delete(ntNo);
		
		return "redirect:/notice/list";
	}
	
	
	/**
	 * 게시글 삭제 - 처리		POST	/notice/delete
	 * - 게시글 번호를 요청파라미터로 전달 받음
	 * - 게시글 번호를 조건으로 게시글 정보를 삭제 처리
	 * - 게시글 목록으로 리다이렉트 → /notice/list.html 응답
	 * @param boardNo
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/notice/delete")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String deletePost(int ntNo, Principal principal) throws Exception {
		log.info("게시글 삭제...");
		
		// 게시글 번호로 게시글 삭제
		System.out.println("ntNo : " + ntNo);
		Notice notice = service.read(ntNo);
		String loginUserId = principal.getName();
		String ntUserId = notice.getNtId();
		
		// 작성자 본인 아닐 때,
		if( !ntUserId.equals(loginUserId) ) {
			return "redirect:/notice/read?ntNo=" + ntNo;
		}
		
		int result = service.delete(ntNo);
		
		return "redirect:/notice/list";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}