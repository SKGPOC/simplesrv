package com.cts.simplesrv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.simplesrv.bo.MessageBO;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api")
@Slf4j
public class SampleRestController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public MessageBO sayHello(){

        return new MessageBO("Hello World!!!");
    }
    
}
