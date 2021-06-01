package com.voice.fukuchproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.voice.fukuchproduct.entity.Attendance;
import com.voice.fukuchproduct.entity.Member;
import com.voice.fukuchproduct.service.AttendanceService;
import com.voice.fukuchproduct.service.MemberService;



@Controller
public class AttendanceController {
	@Autowired
	private AttendanceService service;
	
	@Autowired
	public MemberService m_service;
	
	
	//member_id呼び出し
	@GetMapping("/attendances/new")
	public String newMember(Model model) {
		List<Member> members = m_service.findAll();
		System.out.println("members");
		model.addAttribute("members",members);
		return "attendance";
	}
	
	//新規登録
	@PostMapping("/attendances/new")
	public String create(@ModelAttribute Attendance attendance) {
		System.out.print("attendances");
		service.save(attendance);
		return "redirect:/attendances";
	}
		
	//リスト
	@GetMapping("/attendances")
	public String list(Model model) {
		List<Object[]> attendances = service.innerJoin();
		System.out.println(attendances);
		model.addAttribute("attendances",attendances);
		return "list_attendance";
	}
	
	//詳細
	/*@GetMapping("/attendances/{attendanceId}")
	public String list(@PathVariable Long attendanceId, Model model) {
		Attendance attendance = service.findOne(attendanceId);
		model.addAttribute("attendance",attendance);
		return "show_attendance";
	}*/
		@GetMapping("/attendances/{attendanceId}")
		public String show(@PathVariable Long attendanceId, Model model) {
			Object attendance = service.findByInnerJoin(attendanceId);
			System.out.println(attendance);
			model.addAttribute("attendance",attendance);
			return "show_attendance";
		}

	//更新
	@GetMapping("/attendances/{attendanceId}/edit")
		public String edit(@PathVariable Long attendanceId,Model model) {
			Attendance attendance = service.findOne(attendanceId);
			model.addAttribute("attendance",attendance);
			return "edit_attendance";
		}
	//更新
		@PostMapping("/attendances/{attendanceId}")
		public String update(@PathVariable Long attendanceId, @ModelAttribute Attendance attendance) {
			attendance.setAttendanceId(attendanceId);
			service.save(attendance);
			return "redirect:/attendances";
		}
		
	//削除
		@GetMapping("/attendances/{attendanceId}/delete")
		public String delete(@PathVariable Long attendanceId,Model model) {
			System.out.print(attendanceId);
			service.delete(attendanceId);
			return "redirect:/attendances";
		}
}
