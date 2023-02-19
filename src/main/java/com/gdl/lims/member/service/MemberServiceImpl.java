package com.gdl.lims.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.gdl.lims.member.dao.MemberMapper;
import com.gdl.lims.member.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	/**
	 * 회원정보 목록 조회
	 */
	@Override
	public List<Member> selectMemberList() {
		return memberMapper.selectMemberList();
	}
	
	@Override
	public Member selectLoginUser(String memberId) {
		return memberMapper.selectLoginUser(memberId);
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
		member.setRole("USER");
		member.setMemberPwd(bCryptPasswordEncoder.encode("1234"));
		return memberMapper.insertMember(member);
	}

	/**
	 * 회원정보 수정
	 */
	@Override
	public int updateMember(Member member) {
		// password 변경하는 경우
		if(StringUtils.hasText(member.getChangedPwd())) {
			String encMemberPwd = bCryptPasswordEncoder.encode(member.getChangedPwd());
			member.setChangedPwd(encMemberPwd);
		}
		return memberMapper.updateMember(member);
	}

	/**
	 * 회원정보 삭제
	 */
	@Override
	public int deleteMember(String memberId) {
		return memberMapper.deleteMember(memberId);
	}
	
	@Override
	public Member login(Member member) {
		Member memberInfo = null;
//		String encMemberPwd = bCryptPasswordEncoder.encode(member.getMemberPwd());
//		member.setMemberPwd(encMemberPwd);
		
		int isExistMember = memberMapper.selectMemberById(member.getMemberId());

		if(isExistMember > 0) {
			
			String encMemberPwd = memberMapper.selectMemberPwd(member.getMemberId());
			
			boolean isMatches = bCryptPasswordEncoder.matches(member.getMemberPwd(), encMemberPwd);
			
//			int isAuthentication = memberMapper.selectMemberByLoginInfo(member);
		
//			if(isAuthentication > 0) {
//				memberInfo = memberMapper.selectMember(member.getMemberId());
//			} else {
//				
//			}
			
			if(isMatches) {
				memberInfo = memberMapper.selectMember(member.getMemberId());
			}
		}
		
		return memberInfo;
	}
}
