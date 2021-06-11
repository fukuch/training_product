package com.voice.fukuchproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.voice.fukuchproduct.entity.Member;
import com.voice.fukuchproduct.service.MemberService;

@RestController
public class AjaxController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/Ajax/test/{memberId}")
	public Member getMemberById(@PathVariable Long memberId) {
		Member member =service.findOne(memberId);
		return member;
	}

	}
