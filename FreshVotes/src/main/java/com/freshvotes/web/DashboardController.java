package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController 
{
   @RequestMapping("/")
   public String rootView() {
	   return "index";
   }
   
   @RequestMapping("/dashboard")
   public String dashboard() {
       return "dashboard";
   }
}
