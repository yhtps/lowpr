package com.github.yhtps.lowpr.global.config.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.github.yhtps.lowpr.domain.member.MemberEntity;

import lombok.Getter;

@Getter
public class LowprUser extends User {

	private static final long serialVersionUID = -7701920958876518228L;

	private long no;

	private String email;

	private String nickname;

	public LowprUser(MemberEntity entity) {
		this(entity.getEmail(), entity.getPassword(),
				entity.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.name())).collect(Collectors.toSet()));
		no = entity.getNo();
		email = entity.getEmail();
		nickname = entity.getNickname();
	}

	public LowprUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

}
