package com.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

	// /user
	@GetMapping("/user")
	public String user() {
		return "/user/index";
	}
	// /admin
	@GetMapping("/admin")
	public String admin() {
		return "/admin/index";
	}
}
