package com.collection.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String landingForms() {
        return "forms";
    }
}
