package com.gdl.lims.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gdl.lims.project.domain.Project;

@Mapper
@Repository
public interface ProjectMapper {

	/**
	 * 과제정보 목록 조회
	 * 
	 * @param
	 * @return 과제정보 목록
	 */
	List<Project> selectProjectList();
	
	/**
	 * 과제정보 조회
	 * 
	 * @return 과제정보
	 */
	Project selectProject();
	
	
	/**
	 * 과제정보 등록
	 * 
	 * @return
	 */
	int insertProject();
	
	/**
	 * 과제정보 수정
	 * 
	 * @return
	 */
	int updateProject();
	
	/**
	 * 과제정보 삭제
	 * 
	 * @return
	 */
	int deleteProject();
	
}
