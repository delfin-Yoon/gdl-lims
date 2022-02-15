package com.gdl.lims.budget.service;

import java.util.List;

import com.gdl.lims.budget.domain.Budget;

public interface BudgetService {

	/**
	 * 예산 목록 조회
	 * 
	 * @return 예산 정보 조회
	 */
	public List<Budget> selectBudgetList();

}
