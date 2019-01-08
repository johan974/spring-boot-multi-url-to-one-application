package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlOneController {
    @RequestMapping("/urlone")
    public String redirectOne() {
        return "indexRoleA.html";
    }
    @RequestMapping("/urltwo")
    public String redirectTwo() {
        return "forward:indexRoleB.html";
    }
}