package com.gdl.lims.budget.domain;

import lombok.Data;

@Data
public class Budget {
	
	// 거래아이디
	private String transId;

	// 집행구분 (집행/이금/증액/감액)
	private String transCateCd;

	// 과제번호
	private String projectNo;

	// 과제명
	private String projectTitle;

	// 비목코드
	private String cateLvl1Cd;

	// 세목코드
	private String cateLvl2Cd;

	// 세세목코드
	private String cateLvl3Cd;

	// 사용목적
	private String purpose;

	// 사업자명
	private String corporate;

	// 결제금액
	private String paymentAmount;

	// 결제일자
	private String paymentDate;

	// 결제시간
	private String paymentTime;

	// 카드번호
	private String cardNo;

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
}
