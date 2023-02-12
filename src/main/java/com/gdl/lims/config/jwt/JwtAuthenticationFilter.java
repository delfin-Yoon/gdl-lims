package com.gdl.lims.config.jwt;

import java.io.IOException;import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gdl.lims.config.auth.PrincipalDetails;
import com.gdl.lims.member.domain.Member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private final AuthenticationManager authenticationManger;
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		System.out.println("JwtAuthenticationFilter: 로그인 시도중");
		
		// 1. username, password 받아서
		try {
			ObjectMapper om = new ObjectMapper();
			Member member = om.readValue(request.getInputStream(), Member.class);
			System.out.println(member);

			UsernamePasswordAuthenticationToken authenticationToken = 
					new UsernamePasswordAuthenticationToken(member.getMemberId(), member.getMemberPwd());
			
			// PricipalDetailService - loadUserByUsername() 함수 실행
			Authentication authentication = authenticationManger.authenticate(authenticationToken);

			PrincipalDetails principalDetails = (PrincipalDetails) authentication.getPrincipal();
			System.out.println(principalDetails.getMember().getMemberId());
			
			return authentication;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		System.out.println("successfulAuthentication");
		
//		PrincipalDetails principalDetails = (PrincipalDetails) authResult.getPrincipal();
//		
//		String jwtToken = JWT.create()
////				.withSubject(principalDetails)
//				.withSubject("cos토큰")
//				.withExpiresAt(new Date(System.currentTimeMillis() + (60000 * 30)))
//				.withClaim("memberId", principalDetails.getMember().getMemberId())
//				.withClaim("korName", principalDetails.getMember().getKorName())
//				.sign(Algorithm.HMAC512("gdl"));
		
		super.successfulAuthentication(request, response, chain, authResult);
//		response.addHeader("Authorization", "Bearer " + jwtToken);
	}
}
