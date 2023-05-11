//package com.kakao.test.service;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
//
//import com.kakao.test.domain.KakaoPayApprovalVO;
//import com.kakao.test.domain.KakaoPayReadyVO;
//
//import lombok.extern.java.Log;
//
//@Service
//@Log
//public class KakaoPay {
//
//    private static final String HOST = "https://kapi.kakao.com";
//
//    private KakaoPayReadyVO kakaoPayReadyVO;
//    private KakaoPayApprovalVO kakaoPayApprovalVO;
//    
//    public String kakaoPayReady() {
// 
//        RestTemplate restTemplate = new RestTemplate();
// 
//        // 서버로 요청할 Header
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "KakaoAK " + "256d238c20ee7f62010010ef380f24ba");
//        headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
//        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");
//        
//        // 서버로 요청할 Body
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
//        params.add("cid", "TC0ONETIME");
//        params.add("partner_order_id", "1001");
//        params.add("partner_user_id", "gorany");
//        params.add("item_name", "떡꼬치");
//        params.add("quantity", "1");
//        params.add("total_amount", "500");
//        params.add("tax_free_amount", "100");
//        params.add("approval_url", "http://localhost:8080/kakaoPaySuccess");
//        params.add("cancel_url", "http://localhost:8080/kakaoPayCancel");
//        params.add("fail_url", "http://localhost:8080/kakaoPaySuccessFail");
// 
//        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<MultiValueMap<String, String>>(params, headers);
// 
//        try {
//            kakaoPayReadyVO = restTemplate.postForObject(new URI(HOST + "/v1/payment/ready"), body, KakaoPayReadyVO.class);
//            
//            log.info("" + kakaoPayReadyVO);
//            
//            return kakaoPayReadyVO.getNext_redirect_pc_url();
// 
//        } catch (RestClientException | URISyntaxException e) {
//            
//        }
//        
//        return "/pay";
//    }
//    
//    public KakaoPayApprovalVO kakaoPayInfo(String pg_token, String tid) throws RestClientException, URISyntaxException {
//        // 서버로 요청할 Header
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "KakaoAK " + "256d238c20ee7f62010010ef380f24ba");
//        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        // 서버로 요청할 Body
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("cid", "TC0ONETIME");
//        params.add("tid", tid);
//        params.add("partner_order_id", "partner_order_id");
//        params.add("partner_user_id", "partner_user_id");
//        params.add("pg_token", pg_token);
//
//        // 서버로 요청할 URL
//        String url = "https://kapi.kakao.com/v1/payment/approve";
//
//        // 서버로 요청할 데이터를 담은 객체
//        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<>(params, headers);
//
//        // 서버로 요청하여 데이터 받아오기
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<KakaoPayApprovalVO> responseEntity = restTemplate.postForEntity(url, body, KakaoPayApprovalVO.class);
//
//        // 받아온 데이터 반환
//        return responseEntity.getBody();
//    }
//}