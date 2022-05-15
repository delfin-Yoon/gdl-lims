package com.gdl.lims.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.project.domain.Project;
import com.gdl.lims.project.service.ProjectService;

@RequestMapping("/api")
@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	
	/**
	 * 과제 목록 조회
	 */
	@GetMapping("/projects")
	public List<Project> selectProjectList() {
		return projectService.selectProjectList();
	}
	
	/**
	 * 과제 조회
	 */
	@GetMapping("/project")
	public Project selectProject() {
		return projectService.selectProject();
	}
	
	/**
	 * 과제 등록
	 */
	@PostMapping("/project")
	public int insertProject(Project project) {
		return projectService.insertProject(project);
	}
	
	/**
	 * 과제 수정
	 */
	@PutMapping("/project")
	public int updateProject(Project project) {
		return projectService.updateProject(project);
	}
	
	/**
	 * 과제 삭제
	 */
	@DeleteMapping("/project/{projectNo}")
	public int deleteProject(@PathVariable("projectNo") String projectNo) {
		return projectService.deleteProject(projectNo);
	}
}
