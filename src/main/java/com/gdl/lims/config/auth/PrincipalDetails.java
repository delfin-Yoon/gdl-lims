package com.gdl.lims.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gdl.lims.member.domain.Member;

import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails {
	
	private Member member;
	
	public PrincipalDetails(Member member) {
		this.member = member;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		member.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return member.getMemberPwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return member.getKorName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
