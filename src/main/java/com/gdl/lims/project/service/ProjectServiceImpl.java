package com.gdl.lims.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.project.dao.ProjectMapper;
import com.gdl.lims.project.domain.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;
	
	/**
	 * 과제정보 목록 조회
	 */
	@Override
	public List<Project> selectProjectList() {
//		return projectMapper.selectProjectList();
		return null;
	}

	/**
	 * 과제정보 조회
	 */
	@Override
	public Project selectProject() {
//		return projectMapper.selectProject();
		return null;
	}

	/**
	 * 과제정보 등록
	 */
	@Override
	public int insertProject(Project project) {
//		return projectMapper.insertProject();
		return 0;
	}

	/**
	 * 과제정보 수정
	 */
	@Override
	public int updateProject(Project project) {
//		return projectMapper.updateProject();
		return 0;
	}

	/**
	 * 과제정보 삭제
	 */
	@Override
	public int deleteProject(Project project) {
//		return projectMapper.deleteProject();
		return 0;
	}

}
