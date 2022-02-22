package com.gdl.lims.project.service;

import java.util.List;

import com.gdl.lims.project.domain.Project;

public interface ProjectService {

	/**
	 * ���� ��� ��ȸ
	 * 
	 * @return ���� ���
	 */
	public List<Project> selectProjectList();
	
	
	/**
	 * ���� ��ȸ
	 * 
	 * @return ��������
	 */
	public Project selectProject();
	
	/**
	 * �������� ���
	 * 
	 * @param project
	 * @return
	 */
	public int insertProject( Project project );
	
	/**
	 * �������� ����
	 * 
	 * @param project
	 * @return
	 */
	public int updateProject( Project project );
	
	/**
	 * �������� ����
	 * 
	 * @param project
	 * @return
	 */
	public int deleteProject( Project project );
}
