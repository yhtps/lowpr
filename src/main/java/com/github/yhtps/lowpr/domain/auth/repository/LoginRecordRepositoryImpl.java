package com.github.yhtps.lowpr.domain.auth.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginRecordRepositoryImpl implements LoginRecordRepositoryCustom {

	private final JPAQueryFactory qf;

}
