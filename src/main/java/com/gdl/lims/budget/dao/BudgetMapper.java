package com.gdl.lims.budget.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdl.lims.budget.domain.Budget;

@Mapper
public interface BudgetMapper {

	/**
	 * 예산 목록 조회
	 * 
	 * @param
	 * @return 예산 목록
	 */
	List<Budget> selectBudgetList();
	
	/**
	 * 예산 조회
	 * 
	 * @param transId
	 * @return 예산 정보
	 */
	Budget selectBudget(String transId);
	
	/**
	 * 예산 등록
	 * 
	 * @param budget
	 * @return
	 */
	int insertBudget(Budget budget);
	
	/**
	 * 예산 수정
	 * 
	 * @param budget
	 * @return
	 */
	int updateBudget(Budget budget);
	
	/**
	 * 예 삭제
	 * 
	 * @param transId
	 * @return
	 */
	int deleteBudget(String transId);
	
}
