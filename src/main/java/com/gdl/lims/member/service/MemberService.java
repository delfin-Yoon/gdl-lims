package com.gdl.lims.member.service;

import java.util.List;

import com.gdl.lims.member.domain.Member;

public interface MemberService {

	/**
	 * 회원 목록 조회
	 * 
	 * @return 회원 목록 
	 */
	public List<Member> selectMemberList();
	
	
	/**
	 * 회원 조회
	 * 
	 * @param memberId
	 * @return 회원 정보
	 */
	public Member selectMember(String memberId);
	
	/**
	 * 회원 등록
	 * 
	 * @param member
	 * @return
	 */
	public int insertMember(Member member);
	
	/**
	 * 회원 수정
	 * 
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);
	
	/**
	 * 회원 삭제
	 * 
	 * @param memberId
	 * @return
	 */
	public int deleteMember(String memberId);
	
	
	public Member login(Member member);
}
