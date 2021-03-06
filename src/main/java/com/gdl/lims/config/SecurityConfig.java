package com.gdl.lims.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.filter.CorsFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final CorsFilter corsFilter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and()
//		.addFilter(corsFilter)
//		.formLogin().disable()
//		.httpBasic().disable()
//		.authorizeRequests()
//		.antMatchers("/api/**")
//		.access("hasRole('ROLE_USER') or hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
//		.antMatchers("/api/v1/manager/**")
//		.access("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
//		.antMatchers("/api/v1/admin/**")
//		.access("hasRole('ROLE_ADMIN')")
//		.anyRequest().permitAll();
	}
}
