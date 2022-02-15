package com.gdl.lims.budget.domain;

import lombok.Data;

@Data
public class Budget {
	
	// �ŷ����̵�
	private String transId;

	// ���౸�� (����/�̱�/����/����)
	private String transCateCd;

	// ������ȣ
	private String projectNo;

	// ������
	private String projectTitle;

	// ����ڵ�
	private String cateLvl1Cd;

	// �����ڵ�
	private String cateLvl2Cd;

	// �������ڵ�
	private String cateLvl3Cd;

	// ������
	private String purpose;

	// ����ڸ�
	private String corporate;

	// �����ݾ�
	private String paymentAmount;

	// ��������
	private String paymentDate;

	// �����ð�
	private String paymentTime;

	// ī���ȣ
	private String cardNo;

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
