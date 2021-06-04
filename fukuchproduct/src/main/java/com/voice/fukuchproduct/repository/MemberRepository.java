package com.voice.fukuchproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voice.fukuchproduct.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long>{

	public Member getOne(Long memberId);

	/*
	 * @Modifying
	 * 
	 * @Query{Value ="DELETE FROM player WHERE id = id"},nativeQuery
	 */
}