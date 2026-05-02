package com.project.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

    @GetMapping("/index")
    public String index() {
        return "Hello Library manager!!!!!!!!!!!!!";
    }
}
