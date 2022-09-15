package com.TheDummiesDev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontControllers {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
