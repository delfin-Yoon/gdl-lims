package com.gdl.lims.httpTest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.member.domain.Member;

@RestController
public class HttpTestController {

	@GetMapping("/http/get")
	public String getTest(Member u) {
		return "getTest(): " + u.getMemberId() + ", " + u.getMemberPwd() + ", " + u.getKorName() + ", " + u.getEmail() + ", " + u.getMobileNo();
	}
	
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member u) {
		return "postTest(): " + u.getMemberId() + ", " + u.getMemberPwd() + ", " + u.getKorName() + ", " + u.getEmail() + ", " + u.getMobileNo();
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "putTest()";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "deleteTest()";
	}
	
}
