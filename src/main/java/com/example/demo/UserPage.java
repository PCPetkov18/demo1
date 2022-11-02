package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserPage {

    @RequestMapping("/user")
    public String printUserPageText() {
        return "User: Plamen Petkov" + " Age: 18" + " From: Burgas";
    }
}
