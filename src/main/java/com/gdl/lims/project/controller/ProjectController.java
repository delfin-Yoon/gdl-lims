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
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	@GetMapping("/projects")
	public List<Project> selectProjectList() {
		return projectService.selectProjectList();
	}
	
	/**
	 * 회원정보 조회
	 * 
	 * @return 회원정보
	 */
	@GetMapping("/project")
	public Project selectProject() {
		return projectService.selectProject();
	}
	
	/**
	 * 회원정보 등록
	 * 
	 * @param project
	 * @return
	 */
	@PostMapping("/project")
	public int insertProject(Project project) {
		return projectService.insertProject(project);
	}
	
	/**
	 * 회원정보 수정
	 * 
	 * @param project
	 * @return
	 */
	@PutMapping("/project")
	public int updateProject(Project project) {
		return projectService.updateProject(project);
	}
	
	/**
	 * 회원정보 삭제
	 * 
	 * @param project
	 * @return
	 */
	@DeleteMapping("/project")
	public int deleteProject(Project project) {
		return projectService.deleteProject(project);
	}
}
