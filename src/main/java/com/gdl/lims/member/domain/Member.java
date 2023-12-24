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
	
	// 변경 비밀번호
	private String changedPwd;
	
	// 권한
	private String role;
	
//	public List<String> getRoleList() {
//		if(this.role.length() > 0) {
//			return Arrays.asList(this.role.split(","));
//		}
//		return new ArrayList<>();
//	}
	
	// 회원명
	private String korName;

	// 회원명(영문)
	private String engName;

	// 휴대폰번호
	private String mobileNo;

	// email
	private String email;

	// 등록일시
	private String regDt;

	// 등록자ID
	private String regId;

	// 수정일시
	private String modDt;

	// 수정자ID
	private String modId;
}
