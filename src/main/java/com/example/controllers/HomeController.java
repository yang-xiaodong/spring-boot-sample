package com.example.controllers;

import com.example.services.HelloWorldService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping({"/", "/index.html"})
    public String index(Model model) {
        model.addAttribute("demo", helloWorldService.getHelloMessage());
        return "home/index";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "home/blog";
    }

    @RequestMapping("/pages")
    public String pages() {
        return "home/pages";
    }

    @RequestMapping("/features")
    public String features() {
        return "home/features";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "home/contact";
    }

}
