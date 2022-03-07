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
	 * ȸ������ ��� ��ȸ
	 * 
	 * @param
	 * @return ȸ������ ���
	 */
	@GetMapping("/members")
	public List<Member> selectMemberList() {
		return memberService.selectMemberList();
	}
	
	/**
	 * ȸ������ ��ȸ
	 * 
	 * @return ȸ������
	 */
	@GetMapping("/member")
	public Member selectMember() {
		return memberService.selectMember();
	}
	
	/**
	 * ȸ������ ���
	 * 
	 * @param member
	 * @return
	 */
	@PostMapping("/member")
	public int insertMember(@RequestBody Member member) {
		return memberService.insertMember(member);
	}
	
	/**
	 * ȸ������ ����
	 * 
	 * @param member
	 * @return
	 */
	@PutMapping("/member")
	public int updateMember(Member member) {
		return memberService.updateMember(member);
	}
	
	/**
	 * ȸ������ ����
	 * 
	 * @param member
	 * @return
	 */
	@DeleteMapping("/member")
	public int deleteMember(Member member) {
		return memberService.deleteMember(member);
	}
}
