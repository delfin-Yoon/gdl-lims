package com.gdl.lims.budget.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.budget.domain.Budget;
import com.gdl.lims.budget.service.BudgetService;

@RequestMapping("/api")
@RestController
public class BudgetController {
	
	private static final Logger logger = LogManager.getLogger(BudgetController.class);
	
	@Autowired
	private BudgetService budgetService;
	
	/**
	 * 예산 목록 조회
	 * 
	 * @param
	 * @return 예산 목록
	 */
	@GetMapping("/budgets")
	public List<Budget> selectBudgetList() {
		return budgetService.selectBudgetList();
	}
	
	/**
	 * 예산 조회
	 * 
	 * @param transId
	 * @return 예산 정보
	 */
	@GetMapping("/budget")
	public Budget selectBudget(@RequestParam("transId") String transId) {
		return budgetService.selectBudget(transId);
	}
	
	/**
	 * 예산 등록
	 * 
	 * @param budget
	 */
	@PostMapping("/budget")
	public int insertBudget(@RequestBody Budget budget) {
		logger.debug("insertBudget() budget : {}", budget);
		return budgetService.insertBudget(budget);
	}
	
	/**
	 * 예산 수정
	 * 
	 * @param budget
	 */
	@PutMapping("/budget")
	public int updateBudget(@RequestBody Budget budget) {
		logger.debug("updateBudget() budget : {}", budget);
		return budgetService.updateBudget(budget);
	}
	
	/**
	 * 예산 삭제
	 * 
	 * @param transId
	 */
	@DeleteMapping("/budget/{transId}")
	public int deleteBudget(@PathVariable("transId") String transId) {
		logger.debug("deleteBudget() transId : {}", transId);
		return budgetService.deleteBudget(transId);
	}
}
