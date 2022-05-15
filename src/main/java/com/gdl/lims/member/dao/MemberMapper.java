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
	 * @return memberId
	 */
	Member selectMember(String memberId);
	
	
	/**
	 * 회원정보 등록
	 * 
	 * @param member
	 * @return
	 */
	int insertMember(Member member);
	
	/**
	 * 회원정보 수정
	 * 
	 * @param member
	 * @return
	 */
	int updateMember(Member member);
	
	/**
	 * 회원정보 삭제
	 * 
	 * @param memberId
	 * @return
	 */
	int deleteMember(String memberId);
	
}
