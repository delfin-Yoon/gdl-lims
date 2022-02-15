package com.gdl.lims.budget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.budget.domain.Budget;
import com.gdl.lims.budget.service.BudgetService;

@RestController
public class BudgetController {
	
	@Autowired
	private BudgetService budgetService;
	
	/**
	 * ���� ��� ��ȸ
	 * 
	 * @param
	 * @return ���� ��� ��ȸ
	 */
	@GetMapping("/budgets")
	public List<Budget> selectBudgetList() {
		return budgetService.selectBudgetList();
	}
}
