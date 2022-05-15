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
	 * 회원정보 목록 조회
	 */
	@Override
	public List<Member> selectMemberList() {
		return memberMapper.selectMemberList();
	}

	/**
	 * 회원정보 조회
	 */
	@Override
	public Member selectMember(String memberId) {
		return memberMapper.selectMember(memberId);
	}

	/**
	 * 회원정보 등록
	 */
	@Override
	public int insertMember(Member member) {
		return memberMapper.insertMember(member);
	}

	/**
	 * 회원정보 수정
	 */
	@Override
	public int updateMember(Member member) {
		return memberMapper.updateMember(member);
	}

	/**
	 * 회원정보 삭제
	 */
	@Override
	public int deleteMember(String memberId) {
		return memberMapper.deleteMember(memberId);
	}

}
