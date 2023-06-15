package com.github.yhtps.lowpr.domain.common.enums;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum MemberRole {

	ADMIN("관리자", "ROLE_ADMIN"),
	MANAGER("중간관리자", "ROLE_MANAGER"),
	MEMBER("회원", "ROLE_MEMBER"),
	GUEST("비회원", "ROLE_GUEST");

	private final String korRole;

	private final String prefixedRole;

	public static String roleHierarchy() {
		return IntStream.range(0, MemberRole.values().length - 1)
										.mapToObj(i -> MemberRole.values()[i].prefixedRole() + " > " + MemberRole.values()[i + 1].prefixedRole())
										.collect(Collectors.joining("\n"));
	}

}
