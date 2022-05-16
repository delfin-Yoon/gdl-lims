package com.gdl.lims.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.gdl.lims.member.domain.Member;

@Mapper
@Repository
public interface MemberMapper {

	/**
	 * 회원 목록 조회
	 * 
	 * @param
	 * @return 회원 목록
	 */
	List<Member> selectMemberList();
	
	/**
	 * 회원 조회
	 * 
	 * @param memberId
	 * @return 회원 정보
	 */
	Member selectMember(String memberId);
	
	
	/**
	 * 회원 등록
	 * 
	 * @param member
	 * @return
	 */
	int insertMember(Member member);
	
	/**
	 * 회원 수정
	 * 
	 * @param member
	 * @return
	 */
	int updateMember(Member member);
	
	/**
	 * 회원 삭제
	 * 
	 * @param memberId
	 * @return
	 */
	int deleteMember(String memberId);
	
}
