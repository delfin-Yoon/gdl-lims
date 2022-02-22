package com.gdl.lims.project.domain;

import lombok.Data;

@Data
public class Project {
	
	// ������ȣ
	private String projectNo;

	// ����å����ID
	private String DirectorId;

	// ������
	private String Title;

	// ��������
	private String ShortTitle;

	// ����������
	private String StartDate;

	// ����������
	private String EndDate;

	// �� ������
	private long budget;

	// ������
	private long overhead;

	// ������ ��ú���
	private float overheadProd;

	// ����������ȣ
	private String projNatNo;

	// �������
	private String acknowledgement;

	// ������������ڵ�(����/������/����)
	private String progressCd;

	// ������ ����
	private String projBank;

	// ������ ���¹�ȣ
	private String projAccount;

	// ���� �ֹ���ó
	private String projOrdering;

	// ���� �������
	private String projSupporting;

	// ���� ���࿪��
	private String projRole;

	// �ְ����
	private String projMngDepart;

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
