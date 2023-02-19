package com.gdl.lims.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import lombok.RequiredArgsConstructor;

@RequestMapping("/api")
@RequiredArgsConstructor
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
	public ResponseEntity<Map<String, Object>> selectMemberList() {
		Map<String, Object> result = new HashMap<>();
		result.put("list", memberService.selectMemberList());
		
		return ResponseEntity.ok().body(result);
	}
	
	/**
	 * 회원 조회
	 * 
	 * @param memberId
	 * @return 회원 정보
	 */
	@GetMapping("/member")
	public ResponseEntity<Map<String, Object>> selectMember(@RequestParam("memberId") String memberId) {
		logger.debug("selectMember() memberId : {}", memberId);
		Map<String, Object> result = new HashMap<>();
		result.put("member", memberService.selectMember(memberId));
		
		return ResponseEntity.ok().body(result);
	}
	
	/**
	 * 회원 등록
	 * 
	 * @param member
	 */
	@PostMapping("/member")
	public ResponseEntity<Map<String, Object>> insertMember(@RequestBody Member member) {
		logger.debug("insertMember() member : {}", member);
		Map<String, Object> result = new HashMap<>();
		result.put("count", memberService.insertMember(member));
		
		return ResponseEntity.ok().body(result);
	}
	
	/**
	 * 회원 수정
	 * 
	 * @param member
	 */
	@PutMapping("/member")
//	@PostMapping("/updateMember")
	public ResponseEntity<Map<String, Object>> updateMember(@RequestBody Member member) {
		logger.debug("updateMember() member : {}", member);
		Map<String, Object> result = new HashMap<>();
		result.put("count", memberService.updateMember(member));
		
		return ResponseEntity.ok().body(result);
	}
	
	/**
	 * 회원 삭제
	 * 
	 * @param memberId
	 */
	@DeleteMapping("/member/{memberId}")
	public ResponseEntity<Map<String, Object>> deleteMember(@PathVariable("memberId") String memberId) {
		logger.debug("deleteMember() memberId : {}", memberId);
		Map<String, Object> result = new HashMap<>();
		result.put("count", memberService.deleteMember(memberId));
		
		return ResponseEntity.ok().body(result);
	}
	
	// =================================================================
	@PostMapping("/member/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody Member member) {
		logger.debug("login() member : {}", member);
		Map<String, Object> result = new HashMap<>();
		result.put("member", memberService.login(member));
		
		return ResponseEntity.ok().body(result);
	}
	
}
