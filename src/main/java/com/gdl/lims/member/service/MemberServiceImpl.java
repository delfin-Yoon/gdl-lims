package com.gdl.lims.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.member.dao.MemberMapper;
import com.gdl.lims.member.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	/**
	 * ȸ������ ��� ��ȸ
	 */
	@Override
	public List<Member> selectMemberList() {
		return memberMapper.selectMemberList();
	}

	/**
	 * ȸ������ ��ȸ
	 */
	@Override
	public Member selectMember(String memberId) {
		return memberMapper.selectMember(memberId);
	}

	/**
	 * ȸ������ ���
	 */
	@Override
	public int insertMember(Member member) {
		return memberMapper.insertMember(member);
	}

	/**
	 * ȸ������ ����
	 */
	@Override
	public int updateMember(Member member) {
		return memberMapper.updateMember(member);
	}

	/**
	 * ȸ������ ����
	 */
	@Override
	public int deleteMember(String memberId) {
		return memberMapper.deleteMember(memberId);
	}

}
