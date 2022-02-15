package com.gdl.lims.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gdl.lims.member.domain.Member;

@Mapper
@Repository
public interface MemberMapper {

	/**
	 * ȸ������ ��� ��ȸ
	 * 
	 * @param
	 * @return ȸ������ ���
	 */
	List<Member> selectMemberList();
	
	/**
	 * ȸ������ ��ȸ
	 * 
	 * @return ȸ������
	 */
	Member selectMember();
	
	
	/**
	 * ȸ������ ���
	 * 
	 * @return
	 */
	int insertMember();
	
	/**
	 * ȸ������ ����
	 * 
	 * @return
	 */
	int updateMember();
	
	/**
	 * ȸ������ ����
	 * 
	 * @return
	 */
	int deleteMember();
	
}
