package com.example.demo.controller;


import com.example.demo.WebSecurityConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        logger.info("user/logout");
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:start/start";
    }
}
