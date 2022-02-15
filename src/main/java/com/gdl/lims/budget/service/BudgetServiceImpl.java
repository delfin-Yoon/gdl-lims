package com.gdl.lims.budget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.budget.dao.BudgetMapper;
import com.gdl.lims.budget.domain.Budget;

@Service
public class BudgetServiceImpl implements BudgetService {

	@Autowired
	private BudgetMapper budgetMapper;
	
	@Override
	public List<Budget> selectBudgetList() {
		return null;
	}
}
