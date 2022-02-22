package com.gdl.lims.project.domain;

import lombok.Data;

@Data
public class Project {
	
	// 과제번호
	private String projectNo;

	// 연구책임자ID
	private String DirectorId;

	// 과제명
	private String Title;

	// 과제명약어
	private String ShortTitle;

	// 연구시작일
	private String StartDate;

	// 연구종료일
	private String EndDate;

	// 총 연구비
	private long budget;

	// 간접비
	private long overhead;

	// 간접비 고시비율
	private float overheadProd;

	// 과제고유번호
	private String projNatNo;

	// 과제사사
	private String acknowledgement;

	// 과제진행상태코드(종료/수행중/예정)
	private String progressCd;

	// 과제비 은행
	private String projBank;

	// 과제비 계좌번호
	private String projAccount;

	// 과제 주무부처
	private String projOrdering;

	// 과제 지원기관
	private String projSupporting;

	// 과제 수행역할
	private String projRole;

	// 주관기관
	private String projMngDepart;

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
