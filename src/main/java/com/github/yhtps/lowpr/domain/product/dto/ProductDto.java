package com.github.yhtps.lowpr.domain.product.dto;

import com.github.yhtps.lowpr.domain.common.enums.ProdUnit;
import com.github.yhtps.lowpr.domain.member.MemberEntity;

import lombok.Data;

@Data
public class ProductDto {

	private long no;

	private String name;

	private String description;

	private ProdUnit unit;

	private int quantity;

	private int ea;

	private MemberEntity member;

}
