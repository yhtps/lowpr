package com.github.yhtps.lowpr.domain.member.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.member.dto.MemberInsertDTO;
import com.github.yhtps.lowpr.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberSvcImpl implements MemberSvc {

	private final MemberRepository mr;

	private final PasswordEncoder pe;

	private MemberEntity getCurrMemberEntity() {
		final var email = SecurityContextHolder.getContext().getAuthentication().getName();
		return mr.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email));
	}

	@Override
	public boolean existsByEmail(String email) {
		return mr.findByEmail(email).isPresent();
	}

	@Override
	public void insertMember(MemberInsertDTO dto) {
		final var entity = MemberEntity	.builder()
																		.email(dto.getEmail())
																		.birth(dto.getBirth())
																		.password(pe.encode(dto.getPassword()))
																		.gender(dto.getGender())
																		.build();
		mr.save(entity);
	}

}
