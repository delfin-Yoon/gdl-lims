package com.gdl.lims.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gdl.lims.member.domain.Member;

@Mapper
@Repository
public interface MemberMapper {

	/**
	 * 회원정보 목록 조회
	 * 
	 * @param
	 * @return 회원정보 목록
	 */
	List<Member> selectMemberList();
	
	/**
	 * 회원정보 조회
	 * 
	 * @return 회원정보
	 */
	Member selectMember();
	
	
	/**
	 * 회원정보 등록
	 * 
	 * @return
	 */
	int insertMember();
	
	/**
	 * 회원정보 수정
	 * 
	 * @return
	 */
	int updateMember();
	
	/**
	 * 회원정보 삭제
	 * 
	 * @return
	 */
	int deleteMember();
	
}
