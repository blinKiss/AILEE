package com.emsdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emsdev.service.testService;

@Controller
public class MemberController {
	
	@Autowired
	private testService testsv;
	
	@RequestMapping(value="member/memlist", method=RequestMethod.GET)
    public String urlTest() {

        return "member/memlist"; 
    }

}