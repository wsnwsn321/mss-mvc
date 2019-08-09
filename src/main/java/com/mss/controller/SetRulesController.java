package com.mss.controller;

import com.mss.dao.GameInfoDao;
import com.mss.entities.GameInfo;
import com.mss.service.GameInfoService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/setRules")
public class SetRulesController {

    @Autowired
    private GameInfoService gameInfoService;
    @RequestMapping(value = "ruleSetting" , method = RequestMethod.POST)
    public String saveGameInfo(GameInfo game, Model m, HttpServletRequest request){
        HttpSession httpSession= request.getSession();
        httpSession.setAttribute("game",game);
        m.addAttribute("name",game.getName());
        m.addAttribute("type",game.getType());
        return "rule-settings";
    }
}
