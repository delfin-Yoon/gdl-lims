CREATE DATABASE IF NOT EXISTS `gdl`;

DROP TABLE IF EXISTS gdl.budget;
DROP TABLE IF EXISTS gdl.budget_cate_code;
DROP TABLE IF EXISTS gdl.common_code;
DROP TABLE IF EXISTS gdl.member;
DROP TABLE IF EXISTS gdl.project;
DROP TABLE IF EXISTS gdl.project_card;

-- gdl.`member` definition
CREATE TABLE gdl.`member` (
      `member_id` varchar(30) NOT NULL COMMENT '회원ID',
      `member_pwd` varchar(100) DEFAULT NULL COMMENT '비밀번호',
      `role` varchar(100) DEFAULT NULL COMMENT '권한',
      `kor_name` varchar(30) DEFAULT NULL COMMENT '회원명',
      `eng_name` varchar(30) DEFAULT NULL COMMENT '회원명(영문)',
      `affiliation` varchar(30) DEFAULT NULL COMMENT '소속기관명',
      `mobile_no` varchar(11) DEFAULT NULL COMMENT '휴대폰번호',
      `position` varchar(30) DEFAULT NULL COMMENT '직위/직급',
      `email` varchar(100) DEFAULT NULL COMMENT 'email',
      `reg_dt` timestamp NULL DEFAULT current_timestamp() COMMENT '등록일시',
      `reg_id` varchar(30) DEFAULT NULL COMMENT '등록자ID',
      `mod_dt` timestamp NULL DEFAULT current_timestamp() COMMENT '수정일시',
      `mod_id` varchar(30) DEFAULT NULL COMMENT '수정자ID',
      PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='회원';