package com.voice.fukuchproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.voice.fukuchproduct.entity.Member;
import com.voice.fukuchproduct.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	//ajax
	//member_id呼び出し
		@GetMapping("/Ajax/test")
		public String newAjax(Model model) {
			List<Member> members = service.findAll();
			System.out.println("members");
			model.addAttribute("members",members);
			return "ajax";
		}
	
	//新規登録
	@GetMapping("/members/new")
	public String newMember(Model model) {
		return "member";
	}	
	//新規登録
	@PostMapping("/members/new")
	public String create(@ModelAttribute Member member) {
		System.out.print("members");
		service.save(member);
		return "redirect:/members";
	}
	//リスト
	@GetMapping("/members")
	public String list(Model model) {
		List<Member> members = service.findAll();
		model.addAttribute("members",members);
		return "list_member";
	}
	//詳細
		@GetMapping("/members/{memberId}")
		public String show(@PathVariable Long memberId, Model model) {
			Member member = service.findOne(memberId);
			model.addAttribute("member",member);
			return "show_member";
		}

	//更新
	@GetMapping("/members/{memberId}/edit")
		public String edit(@PathVariable Long memberId,Model model) {
			Member member = service.findOne(memberId);
			model.addAttribute("member",member);
			return "edit_member";
		}
	//更新
		@PostMapping("/members/{memberId}")
		public String update(@PathVariable Long memberId, @ModelAttribute Member member) {
			member.setMemberId(memberId);
			service.save(member);
			return "redirect:/members";
		}
		
	//削除
		@GetMapping("/members/{memberId}/delete")
		public String delete(@PathVariable Long memberId,Model model) {
			service.delete(memberId);
			return "redirect:/members";
		}
	

}
