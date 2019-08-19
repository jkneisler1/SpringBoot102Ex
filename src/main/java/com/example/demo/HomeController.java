package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myvar01", "This is the first variable.");
        model.addAttribute("myvar02", "This is the second variable.");
        return "hometemplate";
    }
}
