package com.one.innovation.digital.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/welcome")
    String welcome(){
        return "Bem Vindo a minha API Spring";
    }
}
