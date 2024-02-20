package com.naresh.springbootdockerapp1.controller;

import com.naresh.springbootdockerapp1.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingsMessage {
    @Autowired
    public MessageService messageService;
    @PostMapping("/{name}")
    public ResponseEntity<String> getMessage(@PathVariable String name){
        return new ResponseEntity<>(messageService.getMessage(name), HttpStatus.OK);

    }
}
