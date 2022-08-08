package com.bbl.controller;

import com.bbl.service.PtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RequestMapping("/api/*")
@Controller
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    private final PtService ptService;

    public MainController(PtService ptService) {
        this.ptService = ptService;
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(HttpSession session, @RequestBody HashMap<String, String> token){
        logger.info("api/login");

        if(token != null){
            session.setAttribute("token", token.get("token"));
            session.setMaxInactiveInterval(-1);
            return "tokenSaved";
        }else{
            return "tokenNotSaved";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        logger.info("api/logout");

        session.invalidate();
        return "redirect:/pt/login";
    }

}
