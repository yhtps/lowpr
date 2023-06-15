package com.github.yhtps.lowpr.global.config.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LowprUserDetailsService implements UserDetailsService {

	private final MemberRepository mr;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final MemberEntity entity = mr.findByEmail(username).orElseThrow();
		return new LowprUser(entity);
	}

}
