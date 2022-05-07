package com.gdl.lims.member.service;

import java.util.List;

import com.gdl.lims.member.domain.Member;

public interface MemberService {

	/**
	 * ȸ������ ��� ��ȸ
	 * 
	 * @return ȸ������ ���
	 */
	public List<Member> selectMemberList();
	
	
	/**
	 * ȸ������ ��ȸ
	 * 
	 * @return ȸ������
	 */
	public Member selectMember(String memberId);
	
	/**
	 * ȸ������ ���
	 * 
	 * @param member
	 * @return
	 */
	public int insertMember(Member member);
	
	/**
	 * ȸ������ ����
	 * 
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);
	
	/**
	 * ȸ������ ����
	 * 
	 * @param member
	 * @return
	 */
	public int deleteMember(String memberId);
}
