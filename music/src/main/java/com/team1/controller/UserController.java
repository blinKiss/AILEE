package com.team1.controller;

import java.io.File;
import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team1.domain.MusicUsers;
import com.team1.mapper.MusicUserMapper;
import com.team1.service.MusicUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

	@Autowired
	private MusicUserService userService;
	
	@GetMapping("/auth/login")
	public String login( Model model
					  , @CookieValue(value="remember-id", required = false) Cookie cookie ) {
		
		String userId = "";
		boolean rememberId = false;
		
		// remember-id 쿠키가 존재하면,
		if( cookie != null ) {
			log.info("CookieName : " + cookie.getName() );
			log.info("CookieValue : " + cookie.getValue() );
			userId = cookie.getValue();		// 쿠키에 저장된 아이디
			rememberId = true;				// 아이디 저장 여부
		}
		
		model.addAttribute("userId", userId);
		model.addAttribute("rememberId", rememberId);
		
		return "/auth/login";
	}
	
	@GetMapping("/auth/join")
	public String joinForm() {
		
		return "/auth/join";
	}
	
	@PostMapping("/auth/join")
	public String join(MusicUsers user, RedirectAttributes rttr, HttpServletRequest request) throws Exception {
		log.info("user : " + user);
		
		int result = userService.join(user);
		
		if(result > 0) {
			HttpSession session = userService.tokenAuthenticaion(user, request);
		}
		
		rttr.addFlashAttribute("msg", user.getName() );
		
		return "redirect:/";
	}
	
	@GetMapping("/auth/success")
	public String success() {
	
		return "/auth/success";
	}
	
	// 아이디 중복 확인
	@Autowired
	private MusicUserMapper userMapper;

	@GetMapping("/checkUserId")
	@ResponseBody
	public String checkUserId(@RequestParam("userId") String userId) throws Exception {
	    int result = userMapper.checkUserId(userId);
	    if (result == 1) {
	        return "fail";
	    } else {
	        return "success";
	    }
	}
	
	// 프로필 수정
	@PostMapping("/updateProfile")
    public String updateProfile(@RequestParam("profileImage") MultipartFile profileImage,
                                Principal principal) {
        try {
            if (!profileImage.isEmpty()) {
                String fileName = principal.getName() + ".webp"; // 사용자 아이디를 파일 이름으로 설정
                String filePath = "/path/to/save/profiles/" + fileName; // 실제 파일 저장 경로
                profileImage.transferTo(new File(filePath));

                // 프로필 업데이트 메서드 호출
                userService.updateProfile(principal.getName(), 1); // 1은 업데이트한 프로필 번호, 여기서는 임의로 1로 설정
            }
        } catch (IOException e) {
            log.error("Failed to update profile image: " + e.getMessage());
            // 예외 처리
        }

        return "redirect:/mypage";
    }

}
