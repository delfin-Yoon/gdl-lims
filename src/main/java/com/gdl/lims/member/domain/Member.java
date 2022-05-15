package com.gdl.lims.member.domain;

import lombok.Data;

@Data
public class Member {
//	public class Member implements UserDetails {
	
//	private static final long serialVersionUID = 8767455674477551881L;

	// 회원ID
	private String memberId;

	// 비밀번호
	private String memberPwd;
	
	// 회원명
	private String korName;

	// 회원명(영문)
	private String engName;

	// 그룹코드
	private String groupCode;

	// 소속기관명
	private String affiliation;

	// 연구자등록번호
	private String researcherId;

	// 휴대폰번호
	private String mobileNo;

	// 주민등록번호
	private String resRegisterId;

	// 직위/직급
	private String position;

	// email
	private String email;

	// 은행
	private String bank;

	// 계좌번호
	private String account;

	// 최종학력
	private String eduLvl;

	// 보호자 연락처
	private String guardianMobile;
	
	// 보호자 관계
	private String guardianRelation;

	// 개인파일하이퍼링크
	private String nasLink;

	// 비고
	private String remark;

	// 등록일시
	private String regDt;

	// 등록자ID
	private String regId;

	// 수정일시
	private String modDt;

	// 수정자ID
	private String modId;

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return memberPwd;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return memberId;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
}
