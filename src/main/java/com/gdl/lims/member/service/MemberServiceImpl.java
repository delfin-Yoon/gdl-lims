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
	public Member selectMember() {
		return memberMapper.selectMember();
	}

	/**
	 * ȸ������ ���
	 */
	@Override
	public int insertMember(Member member) {
		return memberMapper.insertMember();
	}

	/**
	 * ȸ������ ����
	 */
	@Override
	public int updateMember(Member member) {
		return memberMapper.updateMember();
	}

	/**
	 * ȸ������ ����
	 */
	@Override
	public int deleteMember(Member member) {
		return memberMapper.deleteMember();
	}

}
