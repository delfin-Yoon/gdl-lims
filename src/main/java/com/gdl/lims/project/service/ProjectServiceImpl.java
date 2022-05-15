package com.gdl.lims.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.lims.project.dao.ProjectMapper;
import com.gdl.lims.project.domain.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

//	@Autowired
//	private ProjectMapper projectMapper;
	
	@Override
	public List<Project> selectProjectList() {
//		return projectMapper.selectProjectList();
		return null;
	}

	@Override
	public Project selectProject() {
//		return projectMapper.selectProject();
		return null;
	}

	@Override
	public int insertProject(Project project) {
//		return projectMapper.insertProject();
		return 0;
	}

	@Override
	public int updateProject(Project project) {
//		return projectMapper.updateProject();
		return 0;
	}

	@Override
	public int deleteProject(String projectNo) {
//		return projectMapper.deleteProject();
		return 0;
	}

}
