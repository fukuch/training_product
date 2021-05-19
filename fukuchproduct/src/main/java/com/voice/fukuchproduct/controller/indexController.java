package com.voice.fukuchproduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv =new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("new");
		return mv;
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("list-object");
		return mv;
	}
	@RequestMapping("/profile")
	public ModelAndView profile() {
		ModelAndView mv = new ModelAndView("my-profile");
		return mv;
	}
}
