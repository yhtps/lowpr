package com.github.yhtps.lowpr.domain.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@RequiredArgsConstructor
public enum ProdUnit {

	MG("mg"),
	G("g"),
	ML("ml"),
	L("l");

	@Accessors(fluent = true)
	private final String unit;

}
