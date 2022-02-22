package com.gdl.lims.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.project.domain.Project;
import com.gdl.lims.project.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	/**
	 * ȸ������ ��� ��ȸ
	 * 
	 * @param
	 * @return ȸ������ ���
	 */
	@GetMapping("/projects")
	public List<Project> selectProjectList() {
		return projectService.selectProjectList();
	}
	
	/**
	 * ȸ������ ��ȸ
	 * 
	 * @return ȸ������
	 */
	@GetMapping("/project")
	public Project selectProject() {
		return projectService.selectProject();
	}
	
	/**
	 * ȸ������ ���
	 * 
	 * @param project
	 * @return
	 */
	@PostMapping("/project")
	public int insertProject(Project project) {
		return projectService.insertProject(project);
	}
	
	/**
	 * ȸ������ ����
	 * 
	 * @param project
	 * @return
	 */
	@PutMapping("/project")
	public int updateProject(Project project) {
		return projectService.updateProject(project);
	}
	
	/**
	 * ȸ������ ����
	 * 
	 * @param project
	 * @return
	 */
	@DeleteMapping("/project")
	public int deleteProject(Project project) {
		return projectService.deleteProject(project);
	}
}
