package com.gdl.lims.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gdl.lims.project.domain.Project;

@Mapper
@Repository
public interface ProjectMapper {

	/**
	 * �������� ��� ��ȸ
	 * 
	 * @param
	 * @return �������� ���
	 */
	List<Project> selectProjectList();
	
	/**
	 * �������� ��ȸ
	 * 
	 * @return ��������
	 */
	Project selectProject();
	
	
	/**
	 * �������� ���
	 * 
	 * @return
	 */
	int insertProject();
	
	/**
	 * �������� ����
	 * 
	 * @return
	 */
	int updateProject();
	
	/**
	 * �������� ����
	 * 
	 * @return
	 */
	int deleteProject();
	
}
