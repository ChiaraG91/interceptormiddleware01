package com.interceptormiddleware01.interceptormiddleware01.controllers;

import com.interceptormiddleware01.interceptormiddleware01.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/time")
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping
    public ResponseEntity<String> getDateTime(){
        return ResponseEntity.ok().body(basicService.getCurrentTime());
    }
}
