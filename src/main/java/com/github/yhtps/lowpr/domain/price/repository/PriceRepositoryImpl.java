package com.github.yhtps.lowpr.domain.price.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PriceRepositoryImpl implements PriceRepositoryCustom {

	private final JPAQueryFactory qf;

}
