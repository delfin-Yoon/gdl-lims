CREATE DATABASE `gdl`;

DROP TABLE gdl.budget;
DROP TABLE gdl.budget_cate_code;
DROP TABLE gdl.common_code;
DROP TABLE gdl.member;
DROP TABLE gdl.project;
DROP TABLE gdl.project_card;

-- gdl.`member` definition
CREATE TABLE `member` (
  `member_id` varchar(30) NOT NULL COMMENT '회원ID',
  `member_pwd` varchar(100) DEFAULT NULL COMMENT '비밀번호',
  `role` varchar(100) DEFAULT NULL COMMENT '권한',
  `kor_name` varchar(30) DEFAULT NULL COMMENT '회원명',
  `eng_name` varchar(30) DEFAULT NULL COMMENT '회원명(영문)',
  `group_code` char(3) DEFAULT NULL COMMENT '그룹코드',
  `affiliation` varchar(30) DEFAULT NULL COMMENT '소속기관명',
  `researcher_id` varchar(8) DEFAULT NULL COMMENT '연구자등록번호',
  `mobile_no` varchar(11) DEFAULT NULL COMMENT '휴대폰번호',
  `res_register_id` varchar(13) DEFAULT NULL COMMENT '주민등록번호',
  `position` varchar(30) DEFAULT NULL COMMENT '직위/직급',
  `email` varchar(100) DEFAULT NULL COMMENT 'email',
  `bank` varchar(30) DEFAULT NULL COMMENT '은행',
  `account` varchar(50) DEFAULT NULL COMMENT '계좌번호',
  `edu_lvl` varchar(30) DEFAULT NULL COMMENT '최종학력',
  `guardian_mobile` varchar(11) DEFAULT NULL COMMENT '보호자 연락처',
  `guardian_relation` char(3) DEFAULT NULL COMMENT '보호자 관계',
  `nas_link` varchar(100) DEFAULT NULL COMMENT '개인파일하이퍼링크',
  `remark` varchar(200) DEFAULT NULL COMMENT '비고',
  `reg_dt` timestamp NULL DEFAULT current_timestamp() COMMENT '등록일시',
  `reg_id` varchar(30) DEFAULT NULL COMMENT '등록자ID',
  `mod_dt` timestamp NULL DEFAULT current_timestamp() COMMENT '수정일시',
  `mod_id` varchar(30) DEFAULT NULL COMMENT '수정자ID',
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='회원';