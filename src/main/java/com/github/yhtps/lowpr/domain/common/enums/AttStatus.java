package com.github.yhtps.lowpr.domain.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@RequiredArgsConstructor
public enum AttStatus {

	ON("출석"),
	LATE("지각"),
	ABSENCE("결석");

	@Accessors(fluent = true)
	private final String korean;

}
