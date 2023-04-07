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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRController {

    @Autowired
    QRService qrService;

    @GetMapping("/qr-generator")
    public ResponseEntity<String> processQR() {
        String result = qrService.processQR("hardcoded-value");
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

}


