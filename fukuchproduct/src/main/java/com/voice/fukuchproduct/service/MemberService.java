package com.voice.fukuchproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voice.fukuchproduct.entity.Member;
import com.voice.fukuchproduct.repository.MemberRepository;

@Service
@Transactional
	public class MemberService {

@Autowired
	private MemberRepository rep;
	public Member save(Member member) {
		return rep.save(member);
	}
	//リスト
	public List<Member> findAll(){
		return rep.findAll();
	}
	//更新
	public Member findOne(Long memberId) {
		return rep.getOne(memberId);
	}
	//削除
	public void delete(Long memberId) {
       Member member =findOne(memberId);
		rep.delete(member);
    }
	
	}