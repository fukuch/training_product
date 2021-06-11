package com.voice.fukuchproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.voice.fukuchproduct.entity.Login;
import com.voice.fukuchproduct.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	//ログイン画面
	@GetMapping("/login")
	public String getLogin(Model model) { 
	    return "login";
	}

    //ログイン成功時のメニュー画面への遷移
    @PostMapping("/login")
    public String login(@RequestParam String userName, @RequestParam String password,Model model) {
		/*System.out.print(userName);*/
		Login result=service.search(userName,password);
		System.out.print(result);
		if(result == null) {
			int notification = 2;
			model.addAttribute("notification",notification);
			return "login";
		}
		else {
			return "redirect:/attendances";
		}
    }
    
}
