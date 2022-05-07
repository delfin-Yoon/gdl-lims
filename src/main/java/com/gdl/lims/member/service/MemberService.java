package com.gdl.lims.member.service;

import java.util.List;

import com.gdl.lims.member.domain.Member;

public interface MemberService {

	/**
	 * 회원정보 목록 조회
	 * 
	 * @return 회원정보 목록
	 */
	public List<Member> selectMemberList();
	
	
	/**
	 * 회원정보 조회
	 * 
	 * @return 회원정보
	 */
	public Member selectMember(String memberId);
	
	/**
	 * 회원정보 등록
	 * 
	 * @param member
	 * @return
	 */
	public int insertMember(Member member);
	
	/**
	 * 회원정보 수정
	 * 
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);
	
	/**
	 * 회원정보 삭제
	 * 
	 * @param member
	 * @return
	 */
	public int deleteMember(String memberId);
}
