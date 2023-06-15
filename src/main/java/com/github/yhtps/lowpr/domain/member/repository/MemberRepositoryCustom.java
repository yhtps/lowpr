package com.github.yhtps.lowpr.domain.member.repository;

import java.util.Optional;

import com.github.yhtps.lowpr.domain.member.MemberEntity;

public interface MemberRepositoryCustom {

	Optional<MemberEntity> findByEmail(String email);

}
