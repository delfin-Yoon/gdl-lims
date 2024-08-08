package com.gdl.lims.rnaExp.service;

import com.gdl.lims.rnaExp.dao.ExpressionMapper;
import com.gdl.lims.rnaExp.domain.Expression;
import com.gdl.lims.rnaExp.domain.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressionServiceImpl implements ExpressionService {

	@Autowired
	private ExpressionMapper expressionMapper;

	@Override
	public List<String> selectSampleNameList() {
		return expressionMapper.selectSampleNameList();
	}

	@Override
	public List<String> selectCellNameList() {
		return expressionMapper.selectCellNameList();
	}

	/**
	 * Trnascript Expression 목록 조회
	 */
	@Override
	public List<Expression> selectTransExpList(SearchCondition condition) {
		return expressionMapper.selectTransExpList();
	}

	/**
	 * Transcript List 총 건수 조회
	 */
	@Override
	public int selectTransTotalCnt(SearchCondition condition) {
		return 0;
	}

	/**
	 * Gene Expression 목록 조회
	 */
	@Override
	public List<Expression> selectGeneExpList(SearchCondition condition) {
		return expressionMapper.selectGeneExpList();
	}

	/**
	 * Gene List 총 건수 조회
	 */
	@Override
	public int selectGeneTotalCnt(SearchCondition condition) {
		return expressionMapper.selectGeneTotalCnt();
	}


}
