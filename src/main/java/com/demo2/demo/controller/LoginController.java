package com.demo2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
@GetMapping("/")
public String Firstpage(){
    return "dhina.html";
}

}
