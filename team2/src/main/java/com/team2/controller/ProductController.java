package com.team2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProductController {
	

	@GetMapping("/product/list")
	public String list(Model model) throws Exception {


		return "/product/list";
	}
}

