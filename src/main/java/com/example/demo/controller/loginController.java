package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by huang on 2017/11/15.
 */
@Controller
public class loginController {
    @GetMapping("/index")
    public String login(){
        return "index";
    }
}