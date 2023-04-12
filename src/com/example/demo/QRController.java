//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//
//    @Autowired
//    private TestService testService;
//
//    @GetMapping("/qr-generator")
//    public String getHello() {
//        return testService.getHelloString();
//    }
//}


package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class QRController {

    @Autowired
    QRService qrService;

    @GetMapping("/qr-generator")
    public String processQR() {
       try {
    	   ResultDTO result = qrService.processQR();
           ObjectMapper objectMapper = new ObjectMapper();
           return objectMapper.writeValueAsString(result);
	} catch (Exception e) {
		return "Exception found";
	}
    }

}


