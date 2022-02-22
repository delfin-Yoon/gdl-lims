package com.gdl.lims.project.service;

import java.util.List;

import com.gdl.lims.project.domain.Project;

public interface ProjectService {

	/**
	 * 과제 목록 조회
	 * 
	 * @return 과제 목록
	 */
	public List<Project> selectProjectList();
	
	
	/**
	 * 과제 조회
	 * 
	 * @return 과제정보
	 */
	public Project selectProject();
	
	/**
	 * 과제정보 등록
	 * 
	 * @param project
	 * @return
	 */
	public int insertProject( Project project );
	
	/**
	 * 과제정보 수정
	 * 
	 * @param project
	 * @return
	 */
	public int updateProject( Project project );
	
	/**
	 * 과제정보 삭제
	 * 
	 * @param project
	 * @return
	 */
	public int deleteProject( Project project );
}
