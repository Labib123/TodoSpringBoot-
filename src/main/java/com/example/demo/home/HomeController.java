package com.example.demo.home;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value="/")
    public String greeting(){
        return "Hello, Welcome to spring boot ";
    }
    @GetMapping(path = "/{name}")
    public String greetingWithName(@PathVariable String name){
        return  String.format("Hello, Welcome %s to SpringBoot App",name);
    }
}
