package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class QRServiceImpl implements QRService {

	@Override
	public ResultDTO processQR() {
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setQrValue("123456789|WPSLite|H34");
		return resultDTO;
	}

}
