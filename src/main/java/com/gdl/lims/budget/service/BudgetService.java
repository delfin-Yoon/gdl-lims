package com.gdl.lims.budget.service;

import java.util.List;

import com.gdl.lims.budget.domain.Budget;

public interface BudgetService {

	/**
	 * ���� ��� ��ȸ
	 * 
	 * @return ���� ���� ��ȸ
	 */
	public List<Budget> selectBudgetList();

}
