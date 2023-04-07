package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class QRServiceImpl implements QRService {

	@Override
	public String processQR(String qrValue) {
		return "{\"result\": \"123456789|WPSLite|H34\"}";
	}

}
