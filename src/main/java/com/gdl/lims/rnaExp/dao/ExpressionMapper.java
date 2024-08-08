package com.gdl.lims.rnaExp.dao;

import com.gdl.lims.rnaExp.domain.Expression;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExpressionMapper {

	/**
	 * SampleName 검색조건 조회
	 */
	List<String> selectSampleNameList();

	/**
	 * CellName 검색조건 조회
	 */
	List<String> selectCellNameList();

	/**
	 * Transcript Expression 목록 조회
	 * @return Transcript Expression 목록
	 */
	List<Expression> selectTransExpList();

	/**
	 * Gene Expression 목록 조회
	 * @return Gene Expression 목록
	 */
	List<Expression> selectGeneExpList();

	int selectGeneTotalCnt();


}
