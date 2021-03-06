package com.achistar.portal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/home", method= RequestMethod.GET)
	public ModelAndView home(HttpSession session, ModelMap model){
		return new ModelAndView("home");
	}

}

