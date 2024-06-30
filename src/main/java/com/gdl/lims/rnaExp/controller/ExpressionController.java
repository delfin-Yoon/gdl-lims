package com.gdl.lims.rnaExp.controller;

import com.gdl.lims.rnaExp.service.ExpressionService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ExpressionController {
	
	private static final Logger logger = LogManager.getLogger(ExpressionController.class);
	
	@Autowired
	private ExpressionService expressionService;

	/**
	 * 기본 검색조건 목록 조회
	 *
	 * @param 검색조건
	 * @return conditions 목록
	 */
	@GetMapping("/conditionList")
	public ResponseEntity<Map<String, Object>> selectConditionList() {
		Map<String, Object> result = new HashMap<>();
		result.put("sampleNameList", expressionService.selectSampleNameList());
		result.put("cellNameList", expressionService.selectCellNameList());

		return ResponseEntity.ok().body(result);
	}

	/**
	 * Transcript Expression 목록 조회
	 * 
	 * @param 검색조건
	 * @return Transcript Expression 목록
	 */
	@GetMapping("/transExp")
	public ResponseEntity<Map<String, Object>> selectTransExpList() {
		Map<String, Object> result = new HashMap<>();
		result.put("list", expressionService.selectTransExpList());

		return ResponseEntity.ok().body(result);
	}

	/**
	 * Gene Expression 목록 조회
	 *
	 * @param 검색조건
	 * @return Gene Expression 목록
	 */
	@GetMapping("/geneExp")
	public ResponseEntity<Map<String, Object>> selectGeneExpList() {
		Map<String, Object> result = new HashMap<>();
		result.put("list", expressionService.selectGeneExpList());

		return ResponseEntity.ok().body(result);
	}
}
