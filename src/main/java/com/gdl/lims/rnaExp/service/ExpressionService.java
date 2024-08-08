package com.gdl.lims.rnaExp.service;

import com.gdl.lims.rnaExp.domain.Expression;
import com.gdl.lims.rnaExp.domain.SearchCondition;

import java.util.List;

public interface ExpressionService {

	/**
	 * 검색조건 sampleName 조회
	 */
	public List<String> selectSampleNameList();

	/**
	 * 검색조건 cellName 조회
	 */
	public List<String> selectCellNameList();

	/**
	 * Transcript Expression 목록 조회
	 * @return Transcript Expression 목록
	 */
	public List<Expression> selectTransExpList(SearchCondition condition);

	public int selectTransTotalCnt(SearchCondition condition);

	/**
	 * Gene 목록 조회
	 * @return Gene 목록
	 */
	public List<Expression> selectGeneExpList(SearchCondition condition);

	public int selectGeneTotalCnt(SearchCondition condition);

}
