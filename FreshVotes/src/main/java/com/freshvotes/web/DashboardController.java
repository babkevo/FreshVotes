package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // This means that this class is a Controller
public class DashboardController 
{
   @RequestMapping("/") // This means URL's start with /index
   public String rootView() {
	   return "index";
   }
   
   @RequestMapping("/dashboard")  // This means URL's start with /dashboard
   public String dashboard() {
       return "dashboard";
   }
}
