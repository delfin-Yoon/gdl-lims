package com.gdl.lims.member.domain;

import lombok.Data;

@Data
public class Member {
	
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
}
