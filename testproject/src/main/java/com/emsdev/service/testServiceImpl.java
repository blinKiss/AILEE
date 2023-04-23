package com.emsdev.service;

import org.springframework.stereotype.Service;

@Service("TestService")
public class testServiceImpl implements TestService {

	@Override
	public void showTotal() {
		
		System.out.print("test "+ 1000);
		
	}

}