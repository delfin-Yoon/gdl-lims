package com.gdl.lims.member.domain;

import lombok.Data;

@Data
public class Member {
//	public class Member implements UserDetails {
	
//	private static final long serialVersionUID = 8767455674477551881L;

	// ȸ��ID
	private String memberId;

	// ��й�ȣ
	private String memberPwd;
	
	// ȸ����
	private String korName;

	// ȸ����(����)
	private String engName;

	// �׷��ڵ�
	private String groupCode;

	// �Ҽӱ����
	private String affiliation;

	// �����ڵ�Ϲ�ȣ
	private String researcherId;

	// �޴�����ȣ
	private String mobileNo;

	// �ֹε�Ϲ�ȣ
	private String resRegisterId;

	// ����/����
	private String position;

	// �̸���
	private String email;

	// ����
	private String bank;

	// ���¹�ȣ
	private String account;

	// �����з�
	private String eduLvl;

	// ��ȣ�ڿ���ó
	private String guardianMobile;
	
	// ��ȣ�� ����
	private String guardianRelation;

	// �������������۸�ũ
	private String nasLink;

	// ���
	private String remark;

	// ����Ͻ�
	private String regDt;

	// �����ID
	private String regId;

	// �����Ͻ�
	private String modDt;

	// ������ID
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
