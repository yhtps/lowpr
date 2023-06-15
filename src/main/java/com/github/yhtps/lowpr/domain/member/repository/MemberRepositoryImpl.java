package com.github.yhtps.lowpr.domain.member.repository;

import static com.github.yhtps.lowpr.domain.member.QMemberEntity.memberEntity;

import java.util.Optional;

import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

	private final JPAQueryFactory qf;

	@Override
	public Optional<MemberEntity> findByEmail(String email) {
		return Optional.ofNullable(qf.selectFrom(memberEntity).where(memberEntity.email.eq(email)).fetchOne());
	}

}
