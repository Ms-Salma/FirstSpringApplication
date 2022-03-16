package com.example.firstspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //@RequesrMapping deal with web request
    @RequestMapping("/")
    //this method returns a pure text
    //name of method is SimpleConrtroller
    public String SimpleController(){
        return("hello");
    }
}
