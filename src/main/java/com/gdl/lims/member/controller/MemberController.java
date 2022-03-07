package com.gdl.lims.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.member.domain.Member;
import com.gdl.lims.member.service.MemberService;

@RequestMapping("/api")
@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	@GetMapping("/members")
	public List<Member> selectMemberList() {
		return memberService.selectMemberList();
	}
	
	/**
	 * 회원정보 조회
	 * 
	 * @return 회원정보
	 */
	@GetMapping("/member")
	public Member selectMember() {
		return memberService.selectMember();
	}
	
	/**
	 * 회원정보 등록
	 * 
	 * @param member
	 * @return
	 */
	@PostMapping("/member")
	public int insertMember(@RequestBody Member member) {
		return memberService.insertMember(member);
	}
	
	/**
	 * 회원정보 수정
	 * 
	 * @param member
	 * @return
	 */
	@PutMapping("/member")
	public int updateMember(Member member) {
		return memberService.updateMember(member);
	}
	
	/**
	 * 회원정보 삭제
	 * 
	 * @param member
	 * @return
	 */
	@DeleteMapping("/member")
	public int deleteMember(Member member) {
		return memberService.deleteMember(member);
	}
}
