package com.kakao.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kakao.test.service.KakaoPay;

import lombok.Setter;
import lombok.extern.java.Log;
 
@Log
@Controller
public class SampleController {
    
    // @Setter(onMethod_ = @Autowired)
    @Autowired
	private KakaoPay kakaopay;
    
    
    
    @GetMapping("/kakaoPay")
    public void kakaoPayGet() {
        
    }
    
    @PostMapping("/kakaoPay")
    public String kakaoPay() {
        log.info("kakaoPay post............................................");
        
        return "redirect:" + kakaopay.kakaoPayReady();
 
    }
    
    @GetMapping("/kakaoPaySuccess")
    public void kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model) {
        log.info("kakaoPaySuccess get............................................");
        log.info("kakaoPaySuccess pg_token : " + pg_token);
        
        model.addAttribute("info", kakaopay.kakaoPayInfo(pg_token));
        
    }
    
}