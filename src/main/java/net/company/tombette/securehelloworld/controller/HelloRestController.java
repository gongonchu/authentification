package net.company.tombette.securehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping("everybody")
    public String helloUnsecured(){
        return "Hello";
    }
    @GetMapping("spy")
    public String helloSecured(){
        return "Hello in secure mode";
    }
}
