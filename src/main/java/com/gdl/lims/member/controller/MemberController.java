package com.gdl.lims.member.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.member.domain.Member;
import com.gdl.lims.member.service.MemberService;

@RequestMapping("/api")
@RestController
public class MemberController {
	
	private static final Logger logger = LogManager.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 회원 목록 조회
	 * 
	 * @param 검색조건
	 * @return 회원 목록
	 */
	@GetMapping("/members")
	public List<Member> selectMemberList() {
		return memberService.selectMemberList();
	}
	
	/**
	 * 회원 조회
	 * 
	 * @param memberId
	 * @return 회원 정보
	 */
	@GetMapping("/member")
	public Member selectMember(@RequestParam("memberId") String memberId) {
		logger.debug("selectMember() memberId : {}", memberId);
		return memberService.selectMember(memberId);
	}
	
	/**
	 * 회원 등록
	 * 
	 * @param member
	 */
	@PostMapping("/member")
	public int insertMember(@RequestBody Member member) {
		logger.debug("insertMember() member : {}", member);
		return memberService.insertMember(member);
	}
	
	/**
	 * 회원 수정
	 * 
	 * @param member
	 */
	@PutMapping("/member")
	public int updateMember(@RequestBody Member member) {
		logger.debug("updateMember() member : {}", member);
		return memberService.updateMember(member);
	}
	
	/**
	 * 회원 삭제
	 * 
	 * @param memberId
	 */
	@DeleteMapping("/member/{memberId}")
	public int deleteMember(@PathVariable("memberId") String memberId) {
		logger.debug("deleteMember() memberId : {}", memberId);
		return memberService.deleteMember(memberId);
	}
	
	// =================================================================
	@PostMapping("/member/login")
	public Member login(@RequestBody Member member) {
		logger.debug("login() member : {}", member);
		return memberService.login(member);
	}
	
}
