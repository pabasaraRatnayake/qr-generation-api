package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements TestService {

    @Override
    public String getHelloString() {
        return "123456789|WPSLite|H34";
    }
}

