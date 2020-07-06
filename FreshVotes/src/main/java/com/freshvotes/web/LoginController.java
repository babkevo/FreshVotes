package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // This means that this class is a Controller
public class LoginController {
    @RequestMapping("/login") // This means URL's start with /login
    private String login() {
	return "login";
    }
}
