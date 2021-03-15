package com.leohu.springapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
//If a class is flagged as a RestController,
// it is ready for use by Spring MVC to Handle Requests
//It combines @Controller and @ResponseBody
public class HelloController {

    @RequestMapping("/")
    //Maps "/" to the method below (Which returns a text)
    public String index(){
        return "Greetings from Spring Boot!";

    }
}
