package com.mss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/createGame")
public class CreateGameController {

    @GetMapping("/createForm")
    public String test(HttpServletRequest request, Model theModel){
        return "create-game";
    }
}
