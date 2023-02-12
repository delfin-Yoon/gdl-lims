package com.gdl.lims.auth.domain;

import lombok.Data;

@Data
public class Auth {
	
	// 회원ID
	private String memberId;

	// 비밀번호
	private String memberPwd;
	
	// 회원명
	private String korName;
	
	// 권한
	private String roles;
}
