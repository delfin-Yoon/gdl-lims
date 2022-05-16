package com.gdl.lims.budget.service;

import java.util.List;

import com.gdl.lims.budget.domain.Budget;

public interface BudgetService {

	/**
	 * 예산 목록 조회
	 * 
	 * @return 예산 목록
	 */
	public List<Budget> selectBudgetList();

	/**
	 * 예산 조회
	 * 
	 * @param transId
	 * @return
	 */
	public Budget selectBudget(String transId);
	
	/**
	 * 예산 등록
	 * 
	 * @param budget
	 * @return
	 */
	public int insertBudget(Budget budget);
	
	/**
	 * 예산 수정
	 * 
	 * @param budget
	 * @return
	 */
	public int updateBudget(Budget budget);
	
	/**
	 * 예산 삭제
	 * 
	 * @param transId
	 * @return
	 */
	public int deleteBudget(String transId);
}
