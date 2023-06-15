package com.github.yhtps.lowpr.global.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.github.yhtps.lowpr.domain.common.enums.MemberRole;

@Configuration
@EnableWebSecurity
public class LowprWebSecurityConfig {

	@Bean
	static RoleHierarchy roleHierarchy() {
		final RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
		hierarchy.setHierarchy(MemberRole.roleHierarchy());
		return hierarchy;
	}

	@Bean
	static MethodSecurityExpressionHandler methodSecurityExpressionHandler(RoleHierarchy roleHierarchy) {
		final DefaultMethodSecurityExpressionHandler expressionHandler = new DefaultMethodSecurityExpressionHandler();
		expressionHandler.setRoleHierarchy(roleHierarchy);
		return expressionHandler;
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				// TODO js랑 img는 권한별 구분할지?(회원이 아니면 이미지가 로드 안되서 자원아낄수있게)
				authorize -> authorize.requestMatchers("/", "/css/**", "/js/**", "/img/logo/**")
															.permitAll()
															.requestMatchers("/actuator/**")
															.hasRole(MemberRole.ADMIN.name())
															.anyRequest()
															.authenticated())
				.formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
				.rememberMe(Customizer.withDefaults());
		return http.build();
	}

}