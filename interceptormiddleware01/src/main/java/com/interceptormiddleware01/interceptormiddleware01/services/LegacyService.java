package com.interceptormiddleware01.interceptormiddleware01.services;

import org.springframework.stereotype.Service;

@Service
public class LegacyService {

    public String legacy() {
        String legacy = "This is just old code";
        return legacy;
    }
}
