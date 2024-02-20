package com.naresh.springbootdockerapp1.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage(String name) {
        return " Welcome " + name + ", Have a nice day !!";
    }
}
