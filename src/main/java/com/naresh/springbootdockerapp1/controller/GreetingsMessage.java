package com.naresh.springbootdockerapp1.controller;

import com.naresh.springbootdockerapp1.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingsMessage {
    @Autowired
    public MessageService messageService;
    @GetMapping("/{name}")
    public ResponseEntity<String> getMessage(@PathVariable String name){
        return new ResponseEntity<>(messageService.getMessage(name), HttpStatus.OK);

    }
}
