package com.example.demo2.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {


    @GetMapping("/about")
    public  String about (Model model){
        model.addAttribute("title", "Страница о нас");
        return "about";

    }
}