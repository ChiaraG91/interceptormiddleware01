package com.interceptormiddleware01.interceptormiddleware01.controllers;

import com.interceptormiddleware01.interceptormiddleware01.services.LegacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @Autowired
    private LegacyService legacyService;

    @GetMapping
    public ResponseEntity<String> getDateTime(){
        return ResponseEntity.ok().body(legacyService.legacy());
    }

}
