package com.gdl.lims.project.service;

import java.util.List;

import com.gdl.lims.project.domain.Project;

public interface ProjectService {

	public List<Project> selectProjectList();
	
	public Project selectProject();
	
	public int insertProject(Project project);
	
	public int updateProject(Project project);
	
	public int deleteProject(String projectNo);
}
